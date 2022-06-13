package com.trabalhoa3.delivery.adapters.in.CommandLine.components;

import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Component;
import com.trabalhoa3.delivery.adapters.out.fileDatabase.UserRepositoryFileImpl;
import com.trabalhoa3.delivery.domain.services.AuthClient;

public class LoginComponent extends Component {
    private String type;
    private String email;
    private String password;

    public LoginComponent(String type) {
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
        System.out.println();
        System.out.print("E-mail: ");
        this.email = this.scanner.nextLine();
        System.out.print("Senha: ");
        this.password = this.scanner.nextLine();
        System.out.println();

        try {
            UserRepositoryFileImpl userRepository = new UserRepositoryFileImpl();
            AuthClient authClient = new AuthClient(userRepository);
            authClient.execute(this.email, this.password);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void render() {
        System.out.println();
        this.printHeader();
        this.printMenu();
    }

}
