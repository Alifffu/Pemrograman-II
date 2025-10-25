package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Dice> diceList = new LinkedList<>();

        int diceAmount = scanner.nextInt();

        for (int i = 0; i < diceAmount; i++) {
            diceList.add(new Dice());
        }

        for (int i = 0; i < diceList.size(); i++) {
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + diceList.get(i).getValue());
        }

        int totalValue = 0;
        for (Dice dice : diceList) {
            totalValue += dice.getValue();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalValue);

        scanner.close();
    }
}