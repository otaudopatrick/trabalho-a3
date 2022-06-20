package com.trabalhoa3.delivery.adapters.in.CommandLine.components;



import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.trabalhoa3.delivery.domain.entities.externalEntities.ViaCepModel;

/*
* Classe responsável por fazer o request para a API ViaCEP e então envia-la para classe VIA CEP model
* */
public class ZipCodeRequestComponent {
   private String zipCode;
   private String url = "https://viacep.com.br/ws/";

    public ZipCodeRequestComponent(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String zipRequest(ViaCepModel viaCepModel) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("this.url+this.zipCode+/json"))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        Gson gson = new Gson();
        ViaCepModel objZipCode = gson.fromJson(response.body(), ViaCepModel.class);

    }
}
