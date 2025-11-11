package TugasCLI;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {

    protected String title;

    public AbstractMenu(String title) {
        this.title = title;
    }

    @Override
    public void display(Scanner scanner) {
        System.out.println("====================================");
        System.out.println(this.title);
        System.out.println("====================================");

        execute(scanner);
    }

    protected abstract void execute(Scanner scanner);
}