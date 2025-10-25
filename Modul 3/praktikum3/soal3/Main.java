package praktikum3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String studentID = scanner.nextLine();

                    boolean isExist = false;
                    for (Student student : studentList) {
                        if (student.getStudentID().equals(studentID)) {
                            isExist = true;
                            break;
                        }
                    }

                    if (isExist) {
                        System.out.println("NIM sudah terdaftar.");
                    } else {
                        studentList.add(new Student(name, studentID));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String idToDelete = scanner.nextLine();

                    Student studentToRemove = null;
                    for (Student student : studentList) {
                        if (student.getStudentID().equals(idToDelete)) {
                            studentToRemove = student;
                            break;
                        }
                    }

                    if (studentToRemove != null) {
                        studentList.remove(studentToRemove);
                        System.out.println("Mahasiswa dengan NIM " + idToDelete + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + idToDelete + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String idToSearch = scanner.nextLine();

                    boolean isFound = false;
                    for (Student student : studentList) {
                        if (student.getStudentID().equals(idToSearch)) {
                            System.out.println("Data Mahasiswa Ditemukan:");
                            System.out.println("NIM: " + student.getStudentID() + ", Nama: " + student.getName());
                            isFound = true;
                            break;
                        }
                    }

                    if (!isFound) {
                        System.out.println("Mahasiswa dengan NIM " + idToSearch + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    if (studentList.isEmpty()) {
                        System.out.println("Daftar masih kosong.");
                    } else {
                        for (Student student : studentList) {
                            System.out.println("NIM: " + student.getStudentID() + ", Nama: " + student.getName());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);

        scanner.close();
    }
}