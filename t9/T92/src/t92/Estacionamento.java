package t92;

import static jdk.nashorn.internal.runtime.JSType.toInteger;

public class Estacionamento {
    private static final double preço_carro = 3;
    private static final double preço_moto = 1.5;
    private static final long t = 27777800;
    private Veiculo v;
    private long hora_in;
    
    Estacionamento(Veiculo v){
        this.v = v;
        this.hora_in=System.currentTimeMillis();
    }
    
    public void novo(Veiculo v){
        this.v=v;
        this.hora_in=System.currentTimeMillis();
    }
    
    public double Valor(long hora_out){
        if(v.getTipo()=="Carro")
            return (preço_carro*(hora_out-this.hora_in)/t);
        else
            return (preço_moto*(hora_out-this.hora_in)/t);
            
    }
    
}
