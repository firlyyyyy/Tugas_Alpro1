package hitungdiskon;

import java.util.Scanner;

public class HitungDiskon {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("----- APP PENENTUAN DISKON BELANJA -----");
        
        double totalBl, hasil;
        String pilihan;
        
        System.out.print("\nMasukkan Total Belanja Anda: ");
        totalBl = input.nextDouble();
        input.nextLine();
        
        System.out.print("\nApakah Anda Member? (y/n): ");
        pilihan = input.nextLine();
        
        switch (pilihan) {
            case "y":
                if (totalBl >= 500000) {
                    hasil = totalBl - (totalBl * 0.20);
                    System.out.println("\nTotal yang harus di bayar: " + hasil + " Rupiah");
                    System.out.println("----------------------------------------");
                } else {
                    if (totalBl < 500000) {
                        hasil = totalBl  - (totalBl * 0.5);
                        System.out.println("\nTotal yang harus di bayar: " + hasil + " Rupiah");
                        System.out.println("----------------------------------------");
                    }
                }
                break;
                
            case "n":
                if (totalBl >= 500000) {
                    hasil = totalBl - (totalBl * 0.10);
                    System.out.println("\nTotal yang harus di bayar: " + hasil + " Rupiah");
                    System.out.println("----------------------------------------");
                } else {
                    hasil = totalBl;
                    System.out.println("\nTotal yang harus di bayar: " + hasil + " Rupiah");
                    System.out.println("----------------------------------------");
                }
                break;
                
            default:
                System.out.println("\nPilihan tidak valid.");
        }
    }
    
}
