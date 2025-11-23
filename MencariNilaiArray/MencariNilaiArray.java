package MencariNilaiArray;

import java.util.Scanner;

public class MencariNilaiArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] data = { 12, 5, 9, 20, 7, 15 };
        int n;

        System.out.print("\nMasukkan angka yang ingin dicari: ");
        n = input.nextInt();

        for (int i = 0; i < data.length; i++) {
            // Logika untuk mencari nilai.
            if (data[i] == n) {
                System.out.println("\nAnkga ditemukan pada indeks ke-" + i);
                return; // Return digunakan untuk keluar dari perulangan for jika nilainya true.
            }
        }

        System.out.println("\nAngka tidak ditemukan.");
    }
}
