package com.trabalhoa3.delivery.adapters.in.CommandLine.components;

import com.trabalhoa3.delivery.adapters.in.CommandLine.core.Component;

public class LoginComponent extends Component {
    private String type;

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

    @Override
    public void render() {
        System.out.println();
        this.printHeader();
    }

}
