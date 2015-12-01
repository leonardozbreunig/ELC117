package t10.model;

import java.util.ArrayList;
import t10.model.Combustivel;


public class Posto {
    private String cnpj;
    private String razao_social;
    private String nome_fantasia;
    private String bandeira;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String imagem;
    private ArrayList <Combustivel> combustivel;
    
        public Posto(){
    }
    
    public Posto(String cnpj, String razao_social, String nome_fantasia, String bandeira, String rua, String numero, String bairro, String cep, String imagem){
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.bandeira = bandeira;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.imagem = imagem;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
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
}