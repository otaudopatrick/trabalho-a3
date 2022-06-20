package com.trabalhoa3.delivery.domain.entities.externalEntities;

public class ViaCepModel {

    private String cep;
    private String logradouro;
    //    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public String showContent(){
        System.out.println("CEP informado: "+this.cep);
        System.out.println("Rua/Avenida: "+ this.logradouro);
        System.out.println("Cidade: "+ this.localidade);
        System.out.println("Estado: " + this.uf);
        return null;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
