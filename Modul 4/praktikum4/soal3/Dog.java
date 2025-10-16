package praktikum4.soal3;

public class Dog extends Pet {
    private String furColor;
    private String[] abilities;

    public Dog(String n, String r, String w, String[] k) {
        super(r, n);
        this.furColor = w;
        this.abilities = k;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
        System.out.print("Memiliki kemampuan: ");

        for (int i = 0; i < this.abilities.length; i++) {

            System.out.print(this.abilities[i] + " ");
        }

        System.out.println();
    }
}