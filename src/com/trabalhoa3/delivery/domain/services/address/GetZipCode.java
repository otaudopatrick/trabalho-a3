package com.trabalhoa3.delivery.domain.services.address;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/*
* Classe responsável por fazer o request para a API ViaCEP e então envia-la para classe VIA CEP model
* */
public class GetZipCode {
   private final String BASE_URL = "https://viacep.com.br/ws/";
    public String getUrl() {
        return this.BASE_URL;
    }
    public String zipRequest(String zipCode) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(this.BASE_URL+zipCode+"/json"))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        return response.body();
    }
}
