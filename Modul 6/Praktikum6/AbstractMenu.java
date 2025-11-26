package Praktikum6;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {
    protected String title;

    public AbstractMenu(String title) {
        this.title = title;
    }

    @Override
    public void display(Scanner scanner) {
        UIHelper.printHeader(this.title);
        execute(scanner);
    }

    protected abstract void execute(Scanner scanner);
}