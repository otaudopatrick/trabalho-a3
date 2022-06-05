package com.trabalhoa3.delivery.adapters.in.CommandLine.pages.Home;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;
import com.trabalhoa3.delivery.adapters.in.CommandLine.pages.Login.Login;

public class Home extends Page {

    private final int MAX_ATTEMPTS = 2;
    private int choice = -1;
    private int attempts = 0;
    private Map<Integer, Page> pageOptions = new HashMap<Integer, Page>();

    public Home() {
        Page login = new Login();
        pageOptions.put(1, login);
    }

    public static void printHeader() {
        System.out.println("+-----------------------+");
        System.out.println("|                       |");
        System.out.println("|       Bem vindo a     |");
        System.out.println("| Aplicação de Delivery |");
        System.out.println("|                       |");
        System.out.println("+-----------------------+");
    }

    public void printMenu() {
        System.out.println();
        System.out.println("Por Favor, selecione uma opção: ");
        System.out.println();
        System.out.println("1) Login");
        System.out.println("2) Registrar-se");
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
