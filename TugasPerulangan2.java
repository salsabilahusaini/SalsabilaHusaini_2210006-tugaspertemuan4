/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperulangan2;

import java.util.Scanner;
public class TugasPerulangan2 {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
       
        System.out.println("Masukkan batas awal :");
        int batasawal = bilangan.nextInt();
        
        System.out.println("Masukkan batas akhir :");
        int batasakhir = bilangan.nextInt();
        
        // Memastikan batasawal >=1 dan batasakhir <=100
        batasawal = Math.max(batasawal, 1);
        batasakhir = Math.min(batasakhir, 100);
        
        // Menampilkan bilangan prima dan komposit dalam rentangnya
        System.out.println("Bilangan prima " + batasawal + " sd " + batasakhir + " adalah:");
        printPrima(batasawal, batasakhir);
        System.out.println("\nBilangan komposit " + batasawal + " sd " + batasakhir + " adalah:");
        printKomposit(batasawal, batasakhir);
        
        bilangan.close();
    }
    
    // Fungsi untuk menentukan apakah suatu bilangan prima
    public static boolean prima(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }

    // Fungsi untuk menampilkan bilangan prima dalam rentang tertentu
    public static void printPrima(int batasawal, int batasakhir) {
        for (int i = batasawal; i <= batasakhir; i++) {
            if (prima(i))
                System.out.print(i + " ");
        }
    }

    // Fungsi untuk menampilkan bilangan komposit dalam rentang tertentu
    public static void printKomposit(int batasawal, int batasakhir) {
        for (int i = batasawal; i <= batasakhir; i++) {
            if (!prima(i))
                System.out.print(i + " ");
        }
    }
}
