{-
    Escreva uma função addSuffix :: String -> [String] -> [String] usando
    list comprehension, para adicionar um dado sufixo às strings contidas
    numa lista. exemplo: addSuffix "@inf.ufsm.br" ["fulano", "beltrano"]
-}
addSuffix :: String -> [String] -> [String]
addSuffix suffix list = [item ++ suffix | item <- list]

{-
    Reescreva a função do exercício acima, desta vez usando recursão.
-}
addSuffixR :: String -> [String] -> [String]
addSuffixR _ [] = []
addSuffixR suffix (x:xs) = (x ++ suffix) : addSuffixR suffix xs

{-
    Escreva uma função countShorts :: [String] -> Int, que receba uma
    lista de palavras e retorne a quantidade de palavras dessa lista que
    possuam menos de 5 caracteres. Use recursão.
-}
countShorts :: [String] -> Int
countShorts [] = 0
countShorts (x:xs)
    | length x < 5 = 1 + countShorts xs 
    | otherwise = countShorts xs

{-
    Reescreva a função do exercício acima, desta vez usando list comprehension.
-}
countShortsC :: [String] -> Int
countShortsC [] = 0
countShortsC list = length [x | x <- list, length x < 5]

{-
    Escreva uma função ciclo :: Int -> [Int] -> [Int] que receba um número N e
    uma lista de inteiros, retornando uma nova lista com N repetições da lista
    original, com recurção.
-}
ciclo :: Int -> [Int] -> [Int]
ciclo 0 list = list
ciclo _ [] = []
ciclo i x = x ++ ciclo (i - 1) x

{-
    Escreva uma função resursiva combine :: [Int] -> [String] -> [(Int, String)],
    que receba duas listas e combine seus elementos em tuplas.
-}

--combine :: [Int] -> [String] -> [(Int, String)]
