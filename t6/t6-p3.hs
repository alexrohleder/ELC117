import Text.Printf

type Point = (Float, Float)
type Rect  = (Float, Point, Float, Float)

row_num = 8
col_num = 5

getHslColor :: Float -> String
getHslColor color = "hsl(" ++ show(floor color) ++ ", 100%, 50%)"

makeRect :: Float -> Float -> Float -> Float -> String -> String
makeRect x y w h f = printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' fill='%s' />" x y w h f

writeRect :: [Rect] -> String 
writeRect [] = ""
writeRect ((c, (x, y), w, h):rs) =
    let
        f = getHslColor c
    in (makeRect x y w h f) ++ (writeRect rs)

writeRects :: Float -> Float -> [Rect] -> String
writeRects w h r =
    printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg'>%s</svg>" w h (writeRect r)

main1 :: IO ()
main1 =
    let

        rect_width  = 2
        rect_height = 10

        xs = [0, rect_width..rect_width * 360]
        ys = [0]

        pw = last xs + rect_width
        ph = last ys + rect_height

        rects = [(x, (x, y), rect_width, rect_height) | y <- ys, x <- xs]
     
    in writeFile "colors3.svg" $ writeRects pw ph rects
