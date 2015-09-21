import Text.Printf

type Point = (Float, Float)
type Rect  = (Point, Float, Float)

row_num = 8
col_num = 5

getHslColor :: Int -> Int -> String
getHslColor col_itr row_itr =
    let

        col = realToFrac col_itr
        cols = realToFrac col_num
        s = ((cols + 1) - col) / cols * 100

        row = realToFrac row_itr
        rows = realToFrac row_num
        l = ((rows + 1) - row) / rows * 100

    in  "hsl(360, " ++ (show (120 - s)) ++ "%, " ++ (show l) ++ "%)"

makeRect :: Float -> Float -> Float -> Float -> String -> String
makeRect x y w h f = printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' fill='%s' stroke='gray' stroke-width='2'/>" x y w h f

writeRect :: [Rect] -> Int -> Int -> String 
writeRect [] _ _ _ = ""
writeRect (((x, y), w, h):rs) 0 m x =
    let
        f = getHslColor 0 m
    in (makeRect x y w h f) ++ (writeRect rs col_num (m + 1))
writeRect (((x, y), w, h):rs) n m x =
    let
        f = getHslColor n m
    in (makeRect x y w h f) ++ (writeRect rs (n - 1) m)

writeRects :: Float -> Float -> [Rect] -> String
writeRects w h r =
    printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg'>%s</svg>" w h (writeRect r col_num 1 0)

main :: IO ()
main =
    let

        rect_width  = 44
        rect_height = 20

        xs = [0, rect_width..rect_width * 5]
        ys = [0, rect_height..rect_height * 8]

        pw = last xs + rect_width
        ph = last ys + rect_height

        rects = [((x, y), rect_width, rect_height) | y <- ys, x <- xs]
     
    in writeFile "colors.svg" $ writeRects pw ph rects
