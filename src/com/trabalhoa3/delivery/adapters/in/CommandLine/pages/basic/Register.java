package com.trabalhoa3.delivery.adapters.in.CommandLine.pages.basic;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;
import com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.client.RegisterClientPage;
<<<<<<< HEAD
import com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.restaurant.RegisterRestaurantPage;
=======
import com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.deliveryman.RegisterDeliveryManPage;
>>>>>>> feat/create-deliveryman

public class Register extends Page {
  private final int MAX_ATTEMPTS = 2;
  private int choice = -1;
  private int attempts = 0;
  private Map<Integer, Page> pageOptions = new HashMap<Integer, Page>();

  public Register() {
    RegisterClientPage registerClientPage = new RegisterClientPage();
    RegisterDeliveryManPage registerDeliveryManPage = new RegisterDeliveryManPage();

    this.pageOptions.put(1, registerClientPage);
    this.pageOptions.put(2, registerDeliveryManPage);
  }

  public void printHeader() {
    System.out.println("+-----------------------+");
    System.out.println("|                       |");
    System.out.println("|       Resgitro        |");
    System.out.println("|                       |");
    System.out.println("+-----------------------+");
  }

  public void printMenu() {
    System.out.println();
    System.out.println("Por Favor, selecione uma opção: ");
    System.out.println();
    System.out.println("1) Cliente");
    System.out.println("2) Entregador");
    System.out.println("3) Restaurante");
    System.out.println("0) Sair");
    System.out.println();
    do {
      try {
        System.out.print("Opção: ");
        this.choice = this.scanner.nextInt();
        this.redirect(this.pageOptions.get(this.choice));
      } catch (InputMismatchException e) {
        this.scanner.next();
        if (this.attempts == MAX_ATTEMPTS) {
          this.reset();
          this.printMenu();
        }
        this.attempts++;
      }

    } while (this.choice < 0 || this.choice > 3);

  }

  private void reset() {
    this.choice = -1;
    this.attempts = 0;
  }

  @Override
  public void render() {
    this.printHeader();
    this.printMenu();
  }
}
