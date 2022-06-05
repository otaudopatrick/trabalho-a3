package com.trabalhoa3.delivery.adapters.in.CommandLine.core;

public abstract class Component {

    public abstract void render();

    protected void redirect(Page page) {
        page.render();
    }

}
