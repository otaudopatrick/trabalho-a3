package com.trabalhoa3.delivery.adapters.in.CommandLine.pages.Login;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

import com.trabalhoa3.delivery.adapters.in.CommandLine.components.LoginComponent;
import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Component;
import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;

public class Login extends Page {
    private final int MAX_ATTEMPTS = 2;
    private int choice = -1;
    private int attempts = 0;
    private Map<Integer, Component> componentOptions = new HashMap<Integer, Component>();

    public Login() {
        Component loginComponent = new LoginComponent("Cliente");
        componentOptions.put(1, loginComponent);
    }

    private void printHeader() {
        System.out.println("+-----------------------+");
        System.out.println("|                       |");
        System.out.println("|    Login - Delivery   |");
        System.out.println("|                       |");
        System.out.println("+-----------------------+");
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Por Favor, selecione uma opção: ");
        System.out.println();
        System.out.println("1) Eu sou um cliente");
        System.out.println("2) Eu sou um entregador");
        System.out.println("3) Eu sou um restaurante");
        System.out.println("0) Sair");
        System.out.println();
        do {
            try {
                System.out.print("Opção: ");
                this.choice = this.scanner.nextInt();
                Component loginChoice = this.componentOptions.get(this.choice);
                loginChoice.render();
            } catch (InputMismatchException e) {
                this.scanner.next();
                if (this.attempts == MAX_ATTEMPTS) {
                    this.reset();
                    this.printMenu();
                }
                this.attempts++;
            }

        } while (this.choice < 0 || this.choice > 2);
    }

    private void reset() {
        this.choice = -1;
        this.attempts = 0;
    }

    @Override
    public void render() {
        System.out.println();
        this.printHeader();
        this.printMenu();
    }

}
