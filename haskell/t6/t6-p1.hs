
import Text.Printf

type Point = (Float, Float)
type Rect  = (Point, Float, Float)

getHslColor :: Int -> Int -> String
getHslColor col_itr row_itr =
    let s = (5.0 + 1.0 - (realToFrac col_itr)) / 5.0 * 100
        l = (8.0 + 1.0 - (realToFrac row_itr)) / 8.0 * 100
    in  "hsl(360, " ++ (show (120 - s)) ++ "%, " ++ (show l) ++ "%)"

makeRect :: Float -> Float -> Float -> Float -> String -> String
makeRect x y w h f = printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' fill='%s' stroke='gray' stroke-width='2'/>" x y w h f

writeRect :: [Rect] -> Int -> Int -> String 
writeRect [] _ _ = ""

writeRect (((x, y), w, h):rs) 0 m =
    let f = getHslColor 0 m
    in (makeRect x y w h f) ++ (writeRect rs 5 (m + 1))
writeRect (((x, y), w, h):rs) n m =
    let f = getHslColor n m
    in (makeRect x y w h f) ++ (writeRect rs (n - 1) m)

writeRects :: [Rect] -> String
writeRects r = printf "<svg xmlns='http://www.w3.org/2000/svg'>%s</svg>" (writeRect r 5 1)

main :: IO ()
main =
    let rects = [((x, y), 44.0, 20.0) | y <- [0.0, 20.0 .. 20.0 * 8.0], x <- [0.0, 44.0 .. 44.0 * 5.0]]
    in writeFile "colors1.svg" $ writeRects rects