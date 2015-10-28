package t9;

public class Ponto {
    private double x;
    private double y;
    
    Ponto(){
        x=0.0;
        y=0.0;
    }
    
    Ponto(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public void move(double dx,double dy){
        this.x+=dx;
        this.y+=dy;
    }
    
    public double distancia(Ponto p2){
        double dx=p2.x-this.x;
        double dy=p2.y-this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
}
