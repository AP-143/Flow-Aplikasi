import java.util.Scanner;

public class menghitungLuas {
    public static Scanner inputUser;

    public static void main(String[] args) {
        int alas, tinggi, panjang, lebar, luas, pilihan;

        inputUser = new Scanner(System.in);

        System.out.println("=== pilih bangun datar ===");
        System.out.println("1. segitiga");
        System.out.println("2. persegi empat");
        System.out.print("masukan pilihan = ");
        pilihan = inputUser.nextInt();

        if (pilihan == 1) {
            System.out.println("\n");
            System.out.println("=== menghitung luas segitiga ===");
            System.out.print("masukan nilai alas   = ");
            alas = inputUser.nextInt();
            System.out.print("masukan nilai tinggi = ");
            tinggi = inputUser.nextInt();

            luas = alas * tinggi / 2;
            System.out.println("luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah = " + luas);

        } else if (pilihan == 2) {
            System.out.println("\n");
            System.out.println("=== menghitung luas persegi empat ===");
            System.out.print("masukan nilai panjang   = ");
            panjang = inputUser.nextInt();
            System.out.print("masukan nilai lebar     = ");
            lebar = inputUser.nextInt();

            luas = panjang * lebar;
            System.out.println(
                    "luas persegi empat dengan panjang " + panjang + " dan lebar " + lebar + " adalah = " + luas);

        } else {
            System.out.println("pilihan anda tidak tersedia");
        }

    }
}