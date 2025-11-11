package TugasCLI;

import java.util.Scanner;

public class StoreCharacterMenu extends AbstractMenu {

    private PaimonBag paimonBag;

    public StoreCharacterMenu(String title, PaimonBag paimonBag) {
        super(title);
        this.paimonBag = paimonBag;
    }

    @Override
    protected void execute(Scanner scanner) {
        System.out.print("Masukkan nama Karakter: ");
        String input = scanner.nextLine();

        paimonBag.setCharacter(input);

        System.out.println("Karakter '" + input + "' telah disimpan di Paimon's Bag!");
        System.out.println("\nTekan Enter untuk kembali ke Traveler's Wish...");
        scanner.nextLine();
    }
}