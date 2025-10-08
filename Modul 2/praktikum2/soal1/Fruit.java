package praktikum2.soal1;

public class Fruit {
    String name;
    double weight;
    double price;
    double quantityPurchased;

    public Fruit(String name, double weight, double price, double quantityPurchased) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.quantityPurchased = quantityPurchased;
    }

    public void displayInfo() {
        double pricePerKg = price / weight;
        double priceBeforeDiscount = quantityPurchased * pricePerKg;
        int discountMultiplier = (int) (quantityPurchased / 4);

        double totalDiscount = discountMultiplier * (4 * price) * 0.02;

        double priceAfterDiscount = priceBeforeDiscount - totalDiscount;

        System.out.println("Nama Buah: " + name);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + quantityPurchased + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + priceBeforeDiscount);
        System.out.println("Total Diskon: Rp" + totalDiscount);
        System.out.println("Harga Setelah Diskon: Rp" + priceAfterDiscount);
        System.out.println();
    }
}