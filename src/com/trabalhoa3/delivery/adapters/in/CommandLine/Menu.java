package com.trabalhoa3.delivery.adapters.in.CommandLine;

public class Menu {
    public Menu() {
    }

    public void printMenu() {
        System.out.println();
        System.out.println("Por Favor, selecione uma opção: ");
        System.out.println();
        System.out.println("1) Login");
        System.out.println("2) Registrar-se");
        System.out.println();
    }

    public void render() {
        this.printMenu();
    }
}
