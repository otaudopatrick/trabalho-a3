package com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.restaurant;

import com.google.gson.JsonSyntaxException;
import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;
import com.trabalhoa3.delivery.domain.entities.Restaurant;
import com.trabalhoa3.delivery.domain.entities.externalEntities.ViaCepModel;
import com.trabalhoa3.delivery.util.ConsoleIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegisterRestaurantPage extends Page {

  public RegisterRestaurantPage() {
  }

  private void printHeader() {
    System.out.println("+-----------------------+");
    System.out.println("|                       |");
    System.out.println("|   Novo restaurante    |");
    System.out.println("|                       |");
    System.out.println("+-----------------------+");
  }

  public void printMenu() throws IOException, InterruptedException {
    Restaurant restaurant = new Restaurant();
    ViaCepModel modelViaCep = new ViaCepModel();
    System.out.println();

    ConsoleIO
        .typeWriter("Olá, tudo bem? Espero que sim.");
    ConsoleIO.typeWriter("\nEu sou a Bia e vou ajudá-lo com o seu cadastro.");
    ConsoleIO.typeWriter("\nMas primeiro eu preciso saber quem é você, né?");
    ConsoleIO.typeWriter("\n\nQual o nome do seu restaurante? ");
    restaurant.setName(this.scanner.nextLine());
    ConsoleIO.typeWriter("\nQual o CNPJ do seu restaurante (desta filial)? ");
    restaurant.setCnpj(this.scanner.nextLine());

    ConsoleIO.typeWriter("\n\nPERFEITO!!");
    ConsoleIO.typeWriter("\n\nÉ um prazer ter você entre nossos parceiros " + restaurant.getName() + "!!!2");
    ConsoleIO
        .typeWriter(
            "\nSeus clientes precisarão entrar em contato com você.\n\n");
    ConsoleIO.typeWriter("Qual é o seu numêro de telefone? ");
    restaurant.setPhone(this.getPhoneNumber());
    scanner.nextLine();
    ConsoleIO.typeWriter("Muito bem, estamos quase finalizando o cadastro.\n\n");
    int confirma = 0;
    do {
      try {
        ConsoleIO.typeWriter("Insira seu CEP, para  configurar o endereço: ");
        String zipCode = scanner.nextLine();
        modelViaCep.getAtributes(zipCode);
        ConsoleIO.typeWriter(modelViaCep.showContent());
        ConsoleIO.typeWriter("\nVocê confirma os dados acima? \n1.Sim\n2.Não\nOpção: ");
        confirma = scanner.nextInt();
        scanner.nextLine();
      }catch (JsonSyntaxException ex){

      }catch (IllegalStateException ex){
        System.out.println(ex.getMessage());
      }
    } while (confirma != 1);

  }

  private List<Integer> getPhoneNumber() {
    List<Integer> phones = new ArrayList<>();
    int p = this.scanner.nextInt();
    phones.add(p);
    return phones;
  }

  private void getAddress() {
    int cep = this.scanner.nextInt();
  }

  @Override
  public void render() {
    this.printHeader();
    try {
      this.printMenu();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

}
