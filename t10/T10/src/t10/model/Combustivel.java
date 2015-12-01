
package t10.model;

import java.util.Date;

public class Combustivel {
    private Date data;
    
    public Combustivel(Date data){
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
