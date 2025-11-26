package Praktikum6;

import java.util.Scanner;

public class StoreCharacterMenu extends AbstractMenu {
    private Inventory inventory;

    public StoreCharacterMenu(String title, Inventory inventory) {
        super(title);
        this.inventory = inventory;
    }

    @Override
    protected void execute(Scanner scanner) {
        System.out.print("Masukkan nama Karakter: ");
        String input = scanner.nextLine();

        inventory.setCharacter(input);

        UIHelper.printMessage("Karakter '" + input + "' telah disimpan di Paimon's Bag!");
        UIHelper.printMessage("\nTekan Enter untuk kembali ke Traveler's Wish...");
        scanner.nextLine();
    }
}