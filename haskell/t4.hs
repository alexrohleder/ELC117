
{-
    Defina uma função recursiva que receba uma
    lista de números inteiros e produza uma lista
    com cada número elevado ao quadrado
-}

eleva2 :: [Int] -> [Int]
eleva2 [] = []
eleva2 (x:xs) = (x ^ 2) : eleva2 xs

{-
    Defina uma função recursiva que verifique se
    um dado caracter está contido numa string
-}
contido :: Char -> String -> Bool
contido _ "" = False
contido c (x:xs)
    | x == c = True
    | x /= c = contido c xs

{-
    Defina uma função recursiva que receba
    uma string e retire suas vogais
-}
semVogais :: String -> String
semVogais "" = ""
semVogais (x:xs)
    | x `elem` "aeiou" = semVogais xs
    | otherwise = x : semVogais xs

{-
    Defina uma função recursiva que receba
    uma lista de coordenadas de pontos 2D e
    desloque esses pontos em 2 unidades
-}
translate :: [(Float, Float)] -> [(Float, Float)]
translate [] = []
translate ((p1,p2):ps) = (p1 + 2, p2 + 2) : translate ps

{-
     Defina uma função que receba um número n e
    retorne uma tabela de números de 1 a n e seus
    quadrados
-}
geraTabela :: Int -> [(Int, Int)]
geraTabela 0 = [(0, 0)]
geraTabela n = _geraTabela 1 n

_geraTabela :: Int -> Int -> [(Int, Int)]
_geraTabela i n
    | i <= n = (i, i ^ 2) : _geraTabela (i + 1) n
    | otherwise = []
