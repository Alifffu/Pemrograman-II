package praktikum2.soal3;

// Pada baris ini terjadi kesalahan karena seharusnya class sama dengan nama file, disini tertulis employee.
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena char hanya bisa menampung 1 karakter.
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena di sini method tidak ada parameter untuk menerima argumen tersebut.
    // public void setJabatan() {
    //    this.jabatan = j;
    // }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}