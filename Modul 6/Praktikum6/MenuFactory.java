package Praktikum6;

public class MenuFactory {

    public static Menu createMenu(String type, Inventory inventory) {

        if (type.equals("1")) {
            return new StoreCharacterMenu("--- Simpan Karakter ke Tas ---", inventory);
        }
        else if (type.equals("2")) {
            return new ViewCharacterMenu("--- Lihat Isi Tas ---", inventory);
        }

        return null;
    }
}