package praktikum3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Country> countryList = new LinkedList<>();
        HashMap<Integer, String> monthNames = new HashMap<>();

        monthNames.put(1, "Januari");
        monthNames.put(2, "Februari");
        monthNames.put(3, "Maret");
        monthNames.put(4, "April");
        monthNames.put(5, "Mei");
        monthNames.put(6, "Juni");
        monthNames.put(7, "Juli");
        monthNames.put(8, "Agustus");
        monthNames.put(9, "September");
        monthNames.put(10, "Oktober");
        monthNames.put(11, "November");
        monthNames.put(12, "Desember");

        int numberOfCountries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfCountries; i++) {
            String name = scanner.nextLine();
            String type = scanner.nextLine();
            String leader = scanner.nextLine();

            if (type.equalsIgnoreCase("monarki")) {
                countryList.add(new Country(name, type, leader));
            } else {
                int day = scanner.nextInt();
                int month = scanner.nextInt();
                int year = scanner.nextInt();
                scanner.nextLine();
                countryList.add(new Country(name, type, leader, day, month, year));
            }
        }

        for (Country country : countryList) {
            String leadershipType = country.getLeadershipType();
            String capitalizedType = "";

            if (leadershipType.equalsIgnoreCase("monarki")) {
                capitalizedType = "Raja";
            } else if (leadershipType.equalsIgnoreCase("presiden")) {
                capitalizedType = "Presiden";
            } else if (leadershipType.equalsIgnoreCase("perdana menteri")) {
                capitalizedType = "Perdana Menteri";
            } else {
                capitalizedType = leadershipType;
            }

            System.out.println("Negara " + country.getName() + " mempunyai " + capitalizedType + " bernama " + country.getLeaderName());

            if (!leadershipType.equalsIgnoreCase("monarki")) {
                String monthName = monthNames.get(country.getIndependenceMonth());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + country.getIndependenceDay() + " " + monthName + " " + country.getIndependenceYear());
            }

            System.out.println();
        }

        scanner.close();
    }
}