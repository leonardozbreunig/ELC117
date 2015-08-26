-- Exercicio 1
-- verifica se o numero é par, retorna true ou false

isEven :: Int->Bool
isEven n= mod n 2 ==0

-- Exercicio 2
somaquad :: Int -> Int ->Int
somaquad x y = (x*x)+(y*y)

-- Exercicio 3
doubleFirst :: [Int] -> Int
doubleFirst x = (head x)*(head x)

-- Exercicio 4
hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads x y = (head x) == (head y)

-- Exercicio 5
nome :: [String] -> [String]
nome x = map("Mr " ++ )x

-- Exercicio 6
espaco :: [Char] -> Int
espaco x = length (filter(==' ')x)

-- Exercicio 7
func :: Double -> Double
func x = 3*(x*x)+(2/x)+1

sete :: [Double] -> [Double]
sete x = map(func)x

-- Exercicio 8
oito :: [Int] -> [Int]
oito x = map (2015-) (filter(>1970)x)

-- Exercicio 9
serie :: Double -> [Double] -> Double
serie m x = sum(map(\n -> (n/m))x)

-- Exercicio 10
charFound :: Char -> String -> Bool
charFound c s = c `elem` s

-- Exercicio 11
htmlListItems :: [String] -> [String]
htmlListItems x =map(++"</LI>")(map("<LI>" ++)x)

-- Exercicio 12
--takeWhile(/=3)[1,2,3,4,5]
--retorna todos os numeros anteriores ao 3 na lista, quando chega no 3 ele para

-- Exercicio 13
treze :: [String] -> [String]
treze x = filter(\n -> last(n) == 'a') (map(takeWhile(/=' '))x)
