
import Text.Printf

type Point = (Float, Float)
type Rect  = (Point, Float, Float)

row_num = 8
col_num = 5

getLineSaturation :: Int -> String
getLineSaturation row_itr =
    let line_count = realToFrac row_itr
        rows_count = realToFrac row_num
        percent = ((rows_count + 1) - line_count) / rows_count * 100
    in  "hsl(360, 100%, " ++ (show percent) ++ "%)"

makeRect :: Float -> Float -> Float -> Float -> String -> String
makeRect x y w h f = printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' fill='%s' stroke='gray' stroke-width='2'/>" x y w h f

writeRect :: [Rect] -> Int -> Int -> String 
writeRect [] _ _ = ""
writeRect (((x, y), w, h):rs) 0 m =
    let
        f = getLineSaturation m
    in (makeRect x y w h f) ++ (writeRect rs col_num (m + 1))
writeRect (((x, y), w, h):rs) n m =
    let
        f = getLineSaturation m
    in (makeRect x y w h f) ++ (writeRect rs (n - 1) m)

writeRects :: Float -> Float -> [Rect] -> String
writeRects w h r =
    printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg'>%s</svg>" w h (writeRect r col_num 1)

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