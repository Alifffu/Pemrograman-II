import java.util.Scanner;

public class PRAK105_2410817310013_AhmadAlifPratamaPutra {
    static final double phi = 3.14f;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double Radius = scan.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double Height = scan.nextDouble();

        double Volume = phi * Radius * Radius * Height;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", Radius, Height, Volume);

        scan.close();
    }
}