package com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.restaurant;

import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;
import com.trabalhoa3.delivery.domain.entities.Plate;
import com.trabalhoa3.delivery.domain.entities.User;
import com.trabalhoa3.delivery.domain.entities.externalEntities.ViaCepModel;
import com.trabalhoa3.delivery.util.ConsoleIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class RegisterRestaurantPlatePage extends Page {

  private final Plate plate;

  public RegisterRestaurantPlatePage() {
    this.plate = new Plate();
  }

  private void printHeader() {
    System.out.println("+-----------------------+");
    System.out.println("|                       |");
    System.out.println("|      Novo prato       |");
    System.out.println("|                       |");
    System.out.println("+-----------------------+");
  }

  public void printMenu(){

    int choice = 0;
    ConsoleIO.typeWriter("Vamos cadastrar um novo prato? ");

    do {

      ConsoleIO.typeWriter("\nComo esse prato se chama? ");
      plate.setName(this.scanner.nextLine());
      this.getPlatePrice();
      ConsoleIO.typeWriter("Descreva seu prato brevemente: ");
      plate.setDescription(scanner.nextLine());
      getPlatePreparationTime();
      ConsoleIO.typeWriter("\n"+plate.getName());
      ConsoleIO.typeWriter("\n"+plate.getDescription());
      ConsoleIO.typeWriter("\n"+String.valueOf(plate.getPrice()));
      ConsoleIO.typeWriter("\n"+String.valueOf(plate.getPreparationTime()));
      ConsoleIO.typeWriter("Você confirma os dados acima? \n1.Sim\n2.Não\nOpção: ");
      choice = scanner.nextInt();
      this.scanner.nextLine();
    } while (choice != 1);
  }

  private void getPlatePrice(){
    ConsoleIO.typeWriter("Qual o preço desse prato (use . para os centavos e NÃO USE VIRGULAS)? ");
    try {
      plate.setPrice(this.scanner.nextFloat());
      this.scanner.nextLine();
    }catch (Exception e){
      System.out.println(e.getMessage());
      this.scanner.nextLine();
      this.getPlatePrice();
    }
  }

  private void getPlatePreparationTime(){
    ConsoleIO.typeWriter("Quanto tempo leva pra preparar este prato?");
    try {
      plate.setPreparationTime(this.scanner.nextInt());
      this.scanner.nextLine();
    }catch (Exception e){
      System.out.println(e.getMessage());
      this.scanner.nextLine();
      this.getPlatePreparationTime();
    }
  }

  @Override
  public void render() {
    this.printHeader();
    this.printMenu();
  }
}