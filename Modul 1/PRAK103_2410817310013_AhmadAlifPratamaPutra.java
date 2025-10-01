import java.util.Scanner;

public class PRAK103_2410817310013_AhmadAlifPratamaPutra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int awal = input.nextInt();

        int count = 0;
        do {
            if (awal % 2 != 0) {
                System.out.print(awal);
                count++;
                if (count < n) {
                    System.out.print(", ");
                }
            }
            awal++;
        } while (count < n);
        System.out.println();
    }
}