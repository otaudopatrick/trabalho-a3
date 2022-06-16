package com.trabalhoa3.delivery;

import com.trabalhoa3.delivery.adapters.in.CommandLine.CommandLine;
import com.trabalhoa3.delivery.database.Database;

public class App {
    public static void main(String[] args) {
        Database db = new Database();
        db.createTables();
        CommandLine commandLine = new CommandLine();
        commandLine.getHome().render();
    }
}
 