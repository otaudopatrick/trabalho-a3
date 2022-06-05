package com.trabalhoa3.delivery;

import com.trabalhoa3.delivery.adapters.in.CommandLine.CommandLine;
import com.trabalhoa3.delivery.adapters.in.CommandLine.Menu;
import com.trabalhoa3.delivery.adapters.out.fileDatabase.UserRepositoryFileImpl;
import com.trabalhoa3.delivery.database.Database;
import com.trabalhoa3.delivery.domain.entities.User;
import com.trabalhoa3.delivery.domain.ports.UserRepository;
import com.trabalhoa3.delivery.domain.services.CreateNewUser;

public class App {
    public static void main(String[] args) {
        Database db = new Database();
        db.createTables();
        CommandLine commandLine = new CommandLine();
        commandLine.getHome().render();
        // User user = new User("Patrick Luz", "teste@teste.com");
        // UserRepository userRepo = new UserRepositoryFileImpl();
        // CreateNewUser createNewUser = new CreateNewUser(userRepo);
        // createNewUser.execute(user);
    }
}
