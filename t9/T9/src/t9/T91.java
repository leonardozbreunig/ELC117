package t9;

public class T91{

 
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(2,2);
        
        System.out.printf("P1 : (%.2f,%.2f)\n",p1.getX(),p1.getY());
        System.out.printf("P2 : (%.2f,%.2f)\n",p2.getX(),p2.getY());
        
        p1.move(1,1);
        
        System.out.printf("P1 : (%.2f,%.2f)\n",p1.getX(),p1.getY());
        System.out.printf("P2 : (%.2f,%.2f)\n",p2.getX(),p2.getY());
        
        System.out.printf("Distancia : %.2f\n",p1.distancia(p2));
        
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(5,5,3);
        
        System.out.printf("\nC1 : (%.2f,%.2f), %.2f\n",c1.getX(),c1.getY(),c1.getR());
        System.out.printf("C2 : (%.2f,%.2f), %.2f\n",c2.getX(),c2.getY(),c2.getR());
        
        System.out.printf("Area C1: %.2f\n",c1.getArea());
        System.out.printf("Diametro C1: %.2f\n",c1.getDiameter());
        
        System.out.printf("Area C2: %.2f\n",c2.getArea());
        System.out.printf("Diametro C2: %.2f\n",c2.getDiameter());
        
        
        
    }
    
}
