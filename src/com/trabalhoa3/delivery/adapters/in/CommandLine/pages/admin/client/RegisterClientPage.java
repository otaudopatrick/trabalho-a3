package com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.client;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;
import com.trabalhoa3.delivery.domain.entities.User;
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

  public void printMenu() {
    User client = new User();
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
    ConsoleIO.typeWriter("Qual é o seu numêro de telefone? ");
    client.setPhone(this.getPhoneNumber());
    ConsoleIO.typeWriter("Muito bem, estamos quase finalizando o cadastro.\n\n");
    ConsoleIO.typeWriter("Qual é o seu CEP? ");
    this.getAddress();
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
    this.printMenu();
  }

}
