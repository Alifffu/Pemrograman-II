package praktikum2.soal2;

public class Coffee {
    public String coffeeName;
    public String size;
    public double price;
    private String customer;

    public void info() {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }

    public void setCustomer(String pembeli) {
        this.customer = pembeli;
    }

    public String getCustomer() {
        return this.customer;
    }

    public double getTax() {

        return price * 0.11;
    }
}