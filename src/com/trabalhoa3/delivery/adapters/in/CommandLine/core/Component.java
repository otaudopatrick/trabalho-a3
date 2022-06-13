package com.trabalhoa3.delivery.adapters.in.CommandLine.core;

import java.util.Scanner;

public abstract class Component {
    public final Scanner scanner = new Scanner(System.in);

    public abstract void render();

    protected void redirect(Page page) {
        page.render();
    }

}
