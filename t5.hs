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
combine :: [Int] -> [String] -> [(Int, String)]
combine [] _ = []
combine _ [] = []
combine (x:xs) (y:ys) = [(x, y)] ++ combine xs ys

{-
    Escreva uma função numera :: [String] -> [(Int,String)], que receba uma lista
    de palavras e retorne outra lista contendo tuplas com as palavras numeradas
    a partir de 1. 
-}
numera :: [String] -> [(Int, String)]
numera s = _numera 1 s

_numera :: Int -> [String] -> [(Int, String)]
_numera _ [] = []
_numera i (x:xs) = (i, x) : _numera (i + 1) xs

{-
    a. [(x,y) | x <- [1..5], even x, y <- [(x + 1)..6], odd y]
        list comprehension, dois laços são feitos e dois filter são aplicados, a lista x recebe um
        filtro por números pares e a lista y por números impares, logo após isto um map é executado
        para construir uma tupla com x e y.

    b. [a ++ b| a <- ["lazy", "big"], b <- ["frog", "dog"]]
        mais uma função com list comprehension, esta expressão representa um duplo laço percorrendo
        cada elemento do a com cada elemento do b, sendo o b o laço interior ao laço do a. a
        concatenação é feita com a função mais a direita que funciona como um map.

    c. concat [[a, '-'] | a <- "paralelepipedo", a `elem` "aeiou"]
        pega as vogais da palavra paralelepipedo e concatena elas usando o -, isto é feito list
        comprehension, primeiro o comando a `elem` "aeiou" é executado sobre cada caracter da 
        lista de caracteres (string) paralelepipedo, tomando a ação de um filter por se localizar
        no lado direito da list comprehension, logo após o lado direito executa algo como um list
        map montando uma lista de caracteres (string) concatenando cada caracter da lista resultante
        e por último o concat junta estas strings que se encontram em uma lista de string.
-}

{-
    (G. Malcolm, Univ. Liverpool) Write a function crossProduct :: [a] ­> [b] ­> [(a,b)] that takes two lists xs and ys, 
    and returns the list of all possible pairings: [ (x,y) | x <­ xs, y <­ ys ] without using the above list comprehension. 
    (As an exercise in problem decomposition, try first defining a "helper" function pairWithAll :: a ­> [b] ­> [(a,b)] 
        that pairs its first argument with each element in its second.)
-}
crossProduct :: [a] -> [b] -> [(a, b)]
crossProduct _ [] = []
crossProduct [] _ = []
crossProduct (x:xs) ys = pairWithAll x ys ++ crossProduct xs ys

pairWithAll :: a -> [b] -> [(a, b)]
pairWithAll _ [] = []
pairWithAll x (y:ys) = (x, y) : pairWithAll x ys

{-
    Suponha que um retângulo seja representado por uma tupla (Float,Float,Float,Float), contendo respectivamente as
    coordenadas x e y do ponto no seu canto superior esquerdo, seguidas das suas medidas de largura e altura. 
    Sabendo que o eixo x cresce de cima para baixo e o eixo y da esquerda para direita, crie uma função 
    genRects :: Int ­> (Int,Int) ­> [(Float,Float,Float,Float)] que receba um número N e um ponto (x,y) e gere uma sequência 
    de N retângulos não sobrepostos. Os retângulos devem ser alinhados pelos seus topos, a partir do ponto dado, 
    com largura e altura constantes. 
-}

{-
    Escreva uma função recursiva que receba uma lista de tuplas e decomponha cada uma delas, gerando uma tupla de listas.
-}
listToTupla :: [(a, b)] -> ([a], [b])
listToTupla [] = ([], [])
listToTupla ((x,y):z) = ( x:(fst(listToTupla z)) , y:(snd(listToTupla z)) )

{-
    Refaça o exercício anterior usando list comprehension.

listToTuplaLC :: [(a, b)] -> ([a], [b])
listToTuplaLC [] = ([], [])
listToTuplaLC list = ([], [])

-}
