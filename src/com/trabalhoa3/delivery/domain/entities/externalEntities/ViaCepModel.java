package com.trabalhoa3.delivery.domain.entities.externalEntities;

import com.google.gson.Gson;
import com.trabalhoa3.delivery.adapters.in.CommandLine.components.ZipCodeRequestComponent;

import java.io.IOException;

public class ViaCepModel {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public String showContent(){
        /*System.out.println("CEP informado: "+this.cep);
        System.out.println("Rua/Avenida: "+ this.logradouro);
        System.out.println("Cidade: "+ this.localidade);
        System.out.println("Estado: " + this.uf);*/
        return "CEP informado:" +this.cep+"\nRua/Avenida:"+this.logradouro+"\nBairro: "+this.bairro+"\nCidade: "+this.localidade+"\nEstado: "+this.uf;
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

    public void getAtributes(String zipCode) throws IOException, InterruptedException {
        Gson gson = new Gson();
        ZipCodeRequestComponent request = new ZipCodeRequestComponent();
        String response = request.zipRequest(zipCode);
        ViaCepModel model= gson.fromJson(response, ViaCepModel.class);
        this.cep = model.cep;
        this.localidade= model.localidade;
        this.uf = model.uf;
        this.logradouro = model.logradouro;
        this.bairro = model.bairro;
    }
}
