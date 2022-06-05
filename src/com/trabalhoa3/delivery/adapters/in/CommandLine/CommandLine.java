package com.trabalhoa3.delivery.adapters.in.CommandLine;

import com.trabalhoa3.delivery.adapters.in.CommandLine.pages.Home.Home;

public class CommandLine {
    private Home home;

    public CommandLine() {
        this.home = new Home();
    }

    public Home getHome() {
        return this.home;
    }
}
