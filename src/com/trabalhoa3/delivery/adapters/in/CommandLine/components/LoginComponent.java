package com.trabalhoa3.delivery.adapters.in.CommandLine.components;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Component;
import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Page;
import com.trabalhoa3.delivery.adapters.in.CommandLine.pages.admin.client.Home;
import com.trabalhoa3.delivery.adapters.out.fileDatabase.UserRepositoryFileImpl;
import com.trabalhoa3.delivery.domain.services.client.AuthClient;

public class LoginComponent extends Component {
    private String type;
    private String email;
    private String password;
    private final int MAX_ATTEMPTS = 3;
    private int attempts = 0;
    private Map<Integer, Page> pageOptions = new HashMap<Integer, Page>();

    public LoginComponent(String type) {
        Home homeClient = new Home();
        this.pageOptions.put(1, homeClient);
        this.type = type;
    }

    private void printHeader() {
        System.out.println("+-----------------------+");
        System.out.println("|                       |");
        System.out.printf("|    Login - %s    |\n", this.type);
        System.out.println("|                       |");
        System.out.println("+-----------------------+");
    }

    private void printMenu() {
        this.getEmailPassword();
    }

    private void getEmailPassword() {
        Console console = System.console();
        System.out.println();
        System.out.print("E-mail: ");
        this.email = this.scanner.nextLine();
        this.password = new String(console.readPassword("Senha: "));
        System.out.println();

        try {
            UserRepositoryFileImpl userRepository = new UserRepositoryFileImpl();
            AuthClient authClient = new AuthClient(userRepository);
            authClient.execute(this.email, this.password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (this.attempts == this.MAX_ATTEMPTS) {
                this.attempts = 0;
                this.printHeader();
                this.printMenu();
            }
            if (this.attempts != this.MAX_ATTEMPTS) {
                this.attempts++;
                this.getEmailPassword();
            }
        }
    }

    @Override
    public void render() {
        System.out.println();
        this.printHeader();
        this.printMenu();
    }

}
