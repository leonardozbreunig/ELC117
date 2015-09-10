--Exercicio 1

addSuffix :: String -> [String] -> [String]
addSuffix suf str = [ x++suf | x <- str]

--Exercicio 2
ex2 :: String -> [String] -> [String]
ex2 suf [] = []
ex2 suf (x:xs) = (x ++ suf) :ex2 suf xs

--Exercicio 3
countShorts :: [String] -> Int
countShorts [] = 0
countShorts (x:xs) = if length(x)<5 then 1+ countShorts(xs) else countShorts(xs)

--Exercicio 4
ex4 :: [String] -> Int
ex4 str = length[x| x<-str, length(x)<5]

--Exercicio 5
ciclo :: Int ->[Int]-> [Int]
ciclo 0 _ = []
ciclo n lista = lista ++ ciclo (n-1) lista

--Exercicio 6
combine :: [Int] -> [String] -> [(Int,String)]
combine [] _ = []
combine _ [] = []
combine (x:xs) (a:bs) = (x,a):combine xs bs

--Exercicio 7
numera :: [String] -> [(Int,String)]
numera str = aux 0 str

aux :: Int -> [String] -> [(Int,String)]
aux _ [] = []
aux i (x:xs) = if length(x) /=0 then (i+1,x) : aux(i+1) xs else []

--Exercicio 8
--a) agrupa os numeros pares entre 1 e 5 em tuplas com os numeros impares entre 3 e 6
--b) combina a lista A com a lista B
--c) filtra e deixa somente as vogais minusculas separadas com hifen

--Exercicio 9
crossProduct :: [a] -> [b] -> [(a,b)]
crossProduct _ [] = []
crossProduct [] _ = []
crossProduct (x:xs) y = pairWithAll x y ++ crossProduct xs y

pairWithAll :: a -> [b] -> [(a,b)]
pairWithAll _ [] =[]
pairWithAll x (y:ys) = (x,y) : pairWithAll x ys


--Exercicio 11
func :: [(a,b)] -> ([a],[b])
func [] = ([],[])
func [(x,y)] = (aux1 [(x,y)], aux2 [(x,y)])

aux1 :: [(a,b)] -> [a]
aux1 [] = []
aux1 (x:xs) = fst x : aux1 xs

aux2 :: [(a,b)] -> [b]
aux2 [] = []
aux2 (y:ys) = snd y : aux2 ys

--Exercicio 12
funcList :: [(a,b)] -> ([a],[b])
funcList n = ([fst x | x <- n], [snd x | x <- n])

--Exercicio 13
funcAlt :: [(a,b)] -> ([a],[b])
funcAlt [] = ([],[])
funcAlt x = (map(\(a,b) -> a) x, map(\(a,b) -> b) x )

