
package t9;

public class Circle {
    private Ponto p;
    private double r;
    
    Circle(){
        p= new Ponto();
        r=1;
    }
    
    Circle(double x, double y, double r){
        p=new Ponto(x,y);
        this.r=r;
    }
    
    public double getArea(){
        return Math.PI*r*r;
    }
    
    public double getDiameter(){
        return 2*r;
    }

    public Double getX() {
        return p.getX();
    }
    
    public Double getY() {
         return p.getY();
    }

    public double getR() {
        return r;
    }
    
}
