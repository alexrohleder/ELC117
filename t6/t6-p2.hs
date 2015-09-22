import Text.Printf

type Point = (Float, Float)
type Rect  = (Float, Point, Float, Float)

row_num = 8
col_num = 5

getHslColor :: Float -> Int -> Int -> String
getHslColor color col_itr row_itr =
    let

        col = realToFrac col_itr
        cols = realToFrac col_num
        s = ((cols + 1) - col) / cols * 100

        row = realToFrac row_itr
        rows = realToFrac row_num
        l = ((rows + 1) - row) / rows * 100

    in  "hsl(" ++ show(floor color) ++ ", " ++ (show (120 - s)) ++ "%, " ++ (show l) ++ "%)"

makeRect :: Float -> Float -> Float -> Float -> String -> String
makeRect x y w h f = printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' fill='%s' stroke='gray' stroke-width='2'/>\n" x y w h f

writeRect :: [Rect] -> Int -> Int -> String 
writeRect [] _ _ = ""
writeRect ((c, (x, y), w, h):rs) 0 m =
    let
        f = getHslColor c 0 m
    in (makeRect x y w h f) ++ (writeRect rs col_num (m + 1))
writeRect ((c, (x, y), w, h):rs) n m =
    let
        f = getHslColor c n m
    in (makeRect x y w h f) ++ (writeRect rs (n - 1) m)

writeRects :: Float -> Float -> [Rect] -> String
writeRects w h r =
    printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg'>\n%s</svg>" w h (writeRect r col_num 1)

main :: IO ()
main =
    let

        rect_width  = 44
        rect_height = 20
        palette_margin = 10
        palette_count = 3

        xs = concat [[x, x + rect_width .. x + rect_width * 5] | x <- [0, rect_width * 6 + palette_margin .. (rect_width * 6) * palette_count]]
        ys = [0, rect_height..rect_height * 8]
        cs = [360, 360 - (360 / palette_count) .. (360 / palette_count)]

        pw = last xs + rect_width
        ph = last ys + rect_height

        rects = [(c, (x, y), rect_width, rect_height) | c <- cs, y <- ys, x <- xs]
     
    in writeFile "colors2.svg" $ writeRects pw ph rects
