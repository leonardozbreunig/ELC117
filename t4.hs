-- Exercicio 1

eleva2 :: [Int] -> [Int]
eleva2 [] = []
eleva2 (x:xs) = (x*x) : (eleva2(xs)) 

-- Exercicio 2
contido :: Char -> [Char] -> Bool
contido c [] = False
contido c (x:xs) = if c==x then True else contido c xs

--Exercicio 3
semVogais :: [Char] -> [Char]
semVogais [] = []
semVogais (x:xs) = if (x=='a')||(x=='e')||(x=='i')||(x=='o')||(x=='u')||(x=='A')||(x=='E')||(x=='I')||(x=='O')||(x=='U') then (semVogais xs) else x:(semVogais xs)

--Exercicio 4
translate :: (Int,Int)-> (Int,Int)
translate (x,y) = (x+2,y+2)

--Exercicio 5
geraTabela' :: Int -> [(Int,Int)]
geraTabela' n = aux 1 n

aux :: Int -> Int -> [(Int,Int)]
aux i n = if(i <= n) then (i,i^2) : aux (i+1) n else []
