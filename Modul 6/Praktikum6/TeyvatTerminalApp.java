package Praktikum6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeyvatTerminalApp {
    private Scanner scanner;
    private Inventory inventory;
    private Map<String, Menu> menus;

    public TeyvatTerminalApp() {
        this.scanner = new Scanner(System.in);
        this.inventory = new PaimonBag();
        this.menus = new HashMap<>();

        menus.put("1", MenuFactory.createMenu("1", inventory));
        menus.put("2", MenuFactory.createMenu("2", inventory));
    }

    public void run() {
        boolean running = true;
        while (running) {
            displayMainMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                case "2":
                    Menu selectedMenu = menus.get(choice);
                    if (selectedMenu != null) selectedMenu.display(scanner);
                    break;
                case "0":
                    running = false;
                    System.out.println("Sampai jumpa, Traveler!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    scanner.nextLine();
                    break;
            }
        }
        scanner.close();
    }

    private void displayMainMenu() {
        UIHelper.printHeader("Teyvat Terminal");
        System.out.println("Traveler’s Wish:");
        System.out.println("1. Simpan Karakter");
        System.out.println("2. Tampilkan Karakter Tersimpan");
        System.out.println("0. Keluar");
        System.out.print("Pilihan Anda: ");
    }
}