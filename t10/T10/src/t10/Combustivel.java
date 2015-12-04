
package t10;

import java.util.Date;

public class Combustivel {
    private String data;
    private String Comb;
    private String preço;
    
    public Combustivel(String data, String comb, String preço){
        this.data = data;
        this.Comb = comb;
        this.preço = preço;        
    }

    public String getComb() {
        return Comb;
    }

    public void setComb(String Comb) {
        this.Comb = Comb;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }
    
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
