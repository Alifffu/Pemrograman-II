package Praktikum6;

import java.util.Scanner;

public class ViewCharacterMenu extends AbstractMenu {
    private Inventory inventory;

    public ViewCharacterMenu(String title, Inventory inventory) {
        super(title);
        this.inventory = inventory;
    }

    @Override
    protected void execute(Scanner scanner) {
        String character = inventory.getCharacter();

        if (character == null || character.isEmpty()) {
            UIHelper.printMessage("Paimon's Bag masih kosong. Belum ada artefak.");
        } else {
            UIHelper.printMessage("Karakter yang tersimpan saat ini: " + character);
        }

        UIHelper.printMessage("\nTekan Enter untuk kembali ke Traveler’s Wish...");
        scanner.nextLine();
    }
}