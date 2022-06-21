package com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.client;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import com.google.gson.JsonSyntaxException;
import com.trabalhoa3.delivery.adapters.in.CommandLine.components.ZipCodeRequestComponent;
import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;
import com.trabalhoa3.delivery.domain.entities.User;
import com.trabalhoa3.delivery.domain.entities.externalEntities.ViaCepModel;
import com.trabalhoa3.delivery.util.ConsoleIO;

public class RegisterClientPage extends Page {

  public RegisterClientPage() {
  }

  private void printHeader() {
    System.out.println("+-----------------------+");
    System.out.println("|                       |");
    System.out.println("|      Novo cliente     |");
    System.out.println("|                       |");
    System.out.println("+-----------------------+");
  }

  public void printMenu() throws IOException, InterruptedException {
    User client = new User();
    ViaCepModel modelViaCep = new ViaCepModel();
    System.out.println();

    ConsoleIO
        .typeWriter("Olá, tudo bem? Espero que sim.");
    ConsoleIO.typeWriter("\nEu sou a Bia e vou ajudá-lo com o seu cadastro.");
    ConsoleIO.typeWriter("\nMas primeiro eu preciso saber quem é você, né?");
    ConsoleIO.typeWriter("\n\nQual o seu nome completo? ");
    client.setName(this.scanner.nextLine());

    ConsoleIO.typeWriter("\n\nPERFEITO!!");
    ConsoleIO.typeWriter("\n\nPrazer em conhecê-lo " + client.getName() + ".");
    ConsoleIO
        .typeWriter(
            "\nNós podemos precisar também entrar em contato com você.\n\n");
    ConsoleIO.typeWriter("Qual é o seu número de telefone? ");
    client.setPhone(this.getPhoneNumber());
    scanner.nextLine();
    ConsoleIO.typeWriter("Qual seu CPF? ");
    client.setSocialId(this.scanner.nextLine());

    ConsoleIO.typeWriter("Muito bem, estamos quase finalizando o cadastro.\n\n");
    int confirma =0;
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
