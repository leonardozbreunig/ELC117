import Text.Printf

type Point     = (Float,Float)
type Rect      = (Point,Float,Float)

-- Gera retangulo SVG 
-- a partir de coordenadas+dimensoes e de uma string com atributos de estilo
writeRect :: (String,Rect) -> String 
writeRect (style,((x,y),w,h)) = 
  printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' style='%s' />\n" x y w h style

-- Gera codigo-fonte de arquivo SVG 
-- concatenando uma lista de retangulos e seus atributos de estilo
writeRects :: Float -> Float -> [(String,Rect)] -> String 
writeRects w h rs = 
  printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg'>\n" w h 
      ++ (concatMap writeRect rs) ++ "</svg>"


main :: IO ()
main = do
  let
    hue = 210 		-- Cor (0..360)
    m = 13      	-- Numero de Linhas
    n = 7		-- Numero de Colunas
    largura = 80	-- Largura de cada Retangulo
    altura = 50		-- Altura de cada Retangulo
    borda = 5		-- Distancia entre os Retangulos

    style = map(\(a,b) -> (printf"fill:hsl("++show hue++","++show a++"%,"++show b++"%)")) [(s,l) | s <- [100,ceiling(100-(100/(n-1)))..0], l <- [100,ceiling(100-(100/(m-1)))..0]]
    rect = map(\(a,b) -> ((a,b),largura,altura)) [((x*(largura+borda)+borda),(y*(altura+borda)+borda))|x <-[0..n-1],y<-[0..m-1]]
    rects = zip style rect
    (w,h) = ((2*borda+largura)*n,(2*borda+altura)*m)
  writeFile "t6-p1.svg" $ writeRects w h rects
