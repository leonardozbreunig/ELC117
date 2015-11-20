package t10;

import java.util.Date;


public class Gasolina extends Combustivel{
    private float preço;
    
    public Gasolina(Date data, float preço) {
        super(data);
        this.preço = preço;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }    
}
