
import Text.Printf

type Point = (Double, Double)
type Rect  = (Double, Point, Double, Double)

getHslColor :: Double -> Int -> Int -> String
getHslColor color col_itr row_itr =
    let s = (5.0 + 1.0 - (realToFrac col_itr)) / 5.0 * 100
        l = (8.0 + 1.0 - (realToFrac row_itr)) / 8.0 * 100
    in  "hsl(" ++ show(color) ++  ", " ++ show(120 - s) ++ "%, " ++ show(l) ++ "%)"

makeRect :: Double -> Double -> Double -> Double -> String -> String
makeRect x y w h f = printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' fill='%s' stroke='gray' stroke-width='2'/>\n" x y w h f

writeRect :: [Rect] -> Int -> Int -> String 
writeRect [] _ _ = ""

writeRect ((c, (x, y), w, h):rs) 0 m =
    let f = getHslColor c 0 m
    in (makeRect x y w h f) ++ (writeRect rs 5 (m + 1))
writeRect ((c, (x, y), w, h):rs) n m =
    let f = getHslColor c n m
    in (makeRect x y w h f) ++ (writeRect rs (n - 1) m)

writeRects :: [Rect] -> String
writeRects r = printf "<svg xmlns='http://www.w3.org/2000/svg'>\n%s</svg>" (writeRect r 5 1)

main :: IO ()
main =
    let rects = concat [[(360 / (p + 1), (x, y), 44.0, 20.0) | y <- [0.0, 20.0 .. 160.0], x <- [p * 220.0, p * 220.0 + 44.0 .. (p + 1) * 220.0]] | p <- [0 .. 2]]
    in writeFile "colors2.svg" $ writeRects rects