package Praktikum6;

public class PaimonBag implements Inventory {
    private String storedCharacter;

    public PaimonBag() {
        this.storedCharacter = "";
    }

    @Override
    public String getCharacter() {
        return storedCharacter;
    }

    @Override
    public void setCharacter(String character) {
        this.storedCharacter = character;
    }
}