{-
    01.

    Copie a função abaixo para um arquivo .hs e carregue-o no interpretador Haskell. 
    Depois teste essa função e descubra o que faz a função mod. Entregue esse exercício em forma de comentário.
    
    isEven :: Int -> Bool
    isEven n = mod n 2 == 0
-}

{-
    02.

    Crie uma função somaquad :: Int ­> Int ­> Int que calcule a soma dos quadrados de dois números x e y. 
-}
somaquad :: Int -> Int -> Int
somaquad x y = (x * x) + (x * x)

{-
    03.

    Crie uma função doubleFirst :: [Int] ­> Int que calcule o quadrado do primeiro elemento de uma lista.
-}
doubleFirst :: [Int] -> Int
doubleFirst l = (head l) ^ 2

{-
    04.

    Crie uma função hasEqHeads :: [Int] ­> [Int] ­> Bool que verifique se 2 listas possuem o mesmo primeiro elemento.
-}
hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads l1 l2 = (head l1) == (head l2)

{-
    05.

    Escreva uma função que receba uma lista de nomes e adicione a string "Mr. " no início de cada nome. 
-}
prefix :: [String] -> [String]
prefix l = map ("Mr. " ++) l

{-
    06.

    Crie uma função que conte quantos espaços existem numa dada string.
-}
countSpaces :: String -> Int
countSpaces s = length (filter (== ' ') s)

{-
    07.

    Escreva uma função que, dada uma lista de números, calcule 3*n^2 + 2/n + 1 para cada número n da lista.
-}
listCalc :: [Float] -> [Float]
listCalc l = map (\n -> 3 * n ^ 2 + 2 / n + 1) l

{-
    08.

    Escreva uma função que, dada uma lista de idades de pessoas no ano atual, retorne uma lista somente com as 
    idades de quem nasceu depois de 1970.
-}
calcAge :: [Int] -> [Int]
calcAge l = filter (\n -> (2015 - n) > 1970) l

{-
    09.

    Escreva uma função serie :: Double ­> [Double] ­> Double que receba um número m e uma lista de n números, 
    e calcule o resultado da seguinte série:
        x1 m +
        x2 m +
        x3 m +...+
        xn m
-}
serie :: Double -> [Double] -> Double
serie m x = sum (map (/m) x)

{-
    10.

    Crie uma função charFound :: Char ­> String ­> Bool que verifique se o caracter (primeiro argumento) está
    contido na string (segundo argumento).
-}
charFound :: Char -> String -> Bool
charFound c s = c `elem` s

{-
    11.

    Crie uma função htmlListItems :: [String] -> [String], que receba uma lista de strings e retorne outra lista 
    contendo as strings formatadas como itens de lista em HTML. 
-}
htmlListItems :: [String] -> [String]
htmlListItems l = map (\i -> "<li>" ++ i ++ "</li>") l

{-
    12.

    A função takeWhile :: (a -> Bool) -> [a] -> [a] é uma função de alta ordem. Ela recebe uma função condicional e
    uma lista, retornando o "menor prefixo" (= porção inicial) da lista que satisfaça a condição.

    takeWhile (< 5) [1,2,3,4,5] 
        [1, 2, 3, 4]
    takeWhile (/=' ') "Fulana de Tal"
        "Fulana"
    takeWhile odd [1,3,5,7,9,10,11,13,15,17]
        [1,3,5,7,9]
-}

{-
    13.

    Seu amigo Lázaro trabalha com organização de eventos e tem uma longa lista de participantes de uma feira. 
    Os organizadores da feira querem usar uma estratégia de marketing com as participantes do sexo feminino, 
    mas infelizmente a lista só tem os nomes e os dados para contato, sem informação do sexo. Como marketing não é uma ciência exata, 
    já seria suficiente identificar uma boa parte dos nomes femininos, mesmo cometendo alguns erros. Para ajudar o Lázaro rapidamente, 
    você tem a ideia de fazer um programa para identificar os participantes cujo primeiro nome termina com 'a', 
    pois há grande probabilidade de que sejam do sexo feminino. Resolva isso em Haskell, 
    com uma função que receba a lista do Lázaro e retorne a lista
-}
helpLazaro :: [String] -> [String]
helpLazaro l = filter (\n -> last(n) == 'a') l
