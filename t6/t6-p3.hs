
import Text.Printf

type Point = (Double, Double)
type Rect  = (Double, Point, Double, Double)

getHslColor :: Double -> String
getHslColor color = "hsl(" ++ show(floor color) ++ ", 100%, 50%)"

makeRect :: Double -> Double -> Double -> Double -> String -> String
makeRect x y w h f = printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' fill='%s' />" x y w h f

writeRect :: [Rect] -> String 
writeRect [] = ""
writeRect ((c, (x, y), w, h):rs) =
    let f = getHslColor c
    in (makeRect x y w h f) ++ (writeRect rs)

writeRects :: [Rect] -> String
writeRects r = printf "<svg xmlns='http://www.w3.org/2000/svg'>%s</svg>" (writeRect r)

main1 :: IO ()
main1 =
    let rects = [(x, (x, y), 2.0, 10.0) | y <- [0.0], x <- [0.0, 2.0 .. 2.0 * 360]]
    in writeFile "colors3.svg" $ writeRects rects