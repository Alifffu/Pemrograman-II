import java.util.Scanner;

public class PRAK101_2410817310013_AhmadAlifPratamaPutra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String BulanBulan = "";

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        
        switch (bulanLahir) {
            case 1:
                BulanBulan = "Januari";
                break;
            case 2:
                BulanBulan = "Februari";
                break;
            case 3:
                BulanBulan = "Maret";
                break;
            case 4:
                BulanBulan = "April";
                break;
            case 5:
                BulanBulan = "Mei";
                break;
            case 6:
                BulanBulan = "Juni";
                break;
            case 7:
                BulanBulan = "Juli";
                break;
            case 8:
                BulanBulan = "Agustus";
                break;
            case 9:
                BulanBulan = "September";
                break;
            case 10:
                BulanBulan = "Oktober";
                break;
            case 11:
                BulanBulan = "November";
                break;
            case 12:
                BulanBulan = "Desember";
                break;
        }

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggibadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        String beratBadanStr = input.next();

        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + BulanBulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggibadan + " cm dan Berat Badan " + beratBadanStr + " Kilogram");

        input.close();
    }
}