package praktikum3.soal1;

public class Dice {
    private int value;

    public Dice() {
        this.rollValue();
    }

    public void rollValue() {
        this.value = (int)(Math.random() * 6) + 1;
    }

    public int getValue() {
        return this.value;
    }
}