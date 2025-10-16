package praktikum4.soal3;

public class Cat extends Pet {
    private String furColor;

    public Cat(String r, String n, String w) {
        super(r, n);
        this.furColor = w;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
    }
}