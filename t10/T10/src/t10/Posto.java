package t10;

import java.util.ArrayList;


public class Posto {
    private String cnpj;
    private String razao_social;
    private String nome_fantasia;
    private String bandeira;
    private Endereço endereço;
    private ArrayList <Combustivel> combustivel;
    
    public Posto(){
    }
    
    public Posto(String cnpj, String razao_social, String nome_fantasia, String bandeira, Endereço endereço){
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.bandeira = bandeira;
        this.endereço = endereço;
    }
    
    public void AddCombustivel(Combustivel combustivel){
       this.combustivel.add(combustivel);
    }

    public ArrayList<Combustivel> getCombustivel() {
        return combustivel;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}