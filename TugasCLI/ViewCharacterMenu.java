package TugasCLI;

import java.util.Scanner;

public class ViewCharacterMenu extends AbstractMenu {

    private PaimonBag paimonBag;

    public ViewCharacterMenu(String title, PaimonBag paimonBag) {
        super(title);
        this.paimonBag = paimonBag;
    }

    @Override
    protected void execute(Scanner scanner) {
        String Character = paimonBag.getCharacter();

        if (Character == null || Character.isEmpty()) {
            System.out.println("Paimon's Bag masih kosong. Belum ada artefak.");
        } else {
            System.out.println("Karakter yang tersimpan saat ini: " + Character);
        }

        System.out.println("\nTekan Enter untuk kembali ke Traveler's Wish...");
        scanner.nextLine();
    }
}