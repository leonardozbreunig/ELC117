
package t92;

public class Veiculo {
    private String placa;
    private String tipo;// se é carro R$: 3,00, se é moto R$:1,5
    
    Veiculo(String placa, String tipo){
        this.placa=placa;
        this.tipo=tipo;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
}
