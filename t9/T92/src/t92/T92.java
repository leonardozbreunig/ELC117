package t92;

public class T92 {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo("CAR-0000","Carro");
        Veiculo moto = new Veiculo("MOT-0000","Moto");
        Estacionamento x;
        double preço;
        
        x= new Estacionamento(carro);        
        preço = x.Valor(System.currentTimeMillis()+(27777800*3));//carro 3 horas
        System.out.printf("Tipo : %s, Placa: %s,Preço: %.2f\n",carro.getTipo(),carro.getPlaca(),preço);
        
        x= new Estacionamento(moto);        
        preço = x.Valor(System.currentTimeMillis()+(27777800*3));//moto 3 horas
        System.out.printf("Tipo : %s, Placa: %s,Preço: %.2f\n",moto.getTipo(),moto.getPlaca(),preço);
        
        x= new Estacionamento(moto);        
        preço = x.Valor(System.currentTimeMillis()+(27777800*1));//moto 1 horas
        System.out.printf("Tipo : %s, Placa: %s,Preço: %.2f\n",moto.getTipo(),moto.getPlaca(),preço);
        
        x= new Estacionamento(carro);        
        preço = x.Valor(System.currentTimeMillis()+(27777800*1));//carro 1 horas
        System.out.printf("Tipo : %s, Placa: %s,Preço: %.2f\n",carro.getTipo(),carro.getPlaca(),preço);
        
        
        
    }
    
}
