/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperulangan1;

import java.util.Scanner;
public class TugasPerulangan1 {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        
        // Input tiga bilangan bulat
        System.out.println("Masukkan tiga bilangan :");
        int bil1 = bilangan.nextInt();
        int bil2 = bilangan.nextInt();
        int bil3 = bilangan.nextInt();
        
        // Panggil fungsi untuk memeriksa apakah ketiga bilangan adalah ribuan atau tidak
        boolean Ribuan = ribuan(bil1, bil2, bil3);
        
        // Tampilkan hasil
        if (Ribuan) {
            System.out.println("Semua bilangan adalah ribuan.");
        } else {
            System.out.println("Tidak semua bilangan adalah ribuan.");
        }
        
        bilangan.close();
    }
    
    // Fungsi untuk memeriksa apakah tiga bilangan bulat adalah ribuan
    public static boolean ribuan(int bil1, int bil2, int bil3){
        return (bil1 >= 1000 && bil1 < 10000) && (bil2 >= 1000 && bil2 < 10000) && (bil3 >= 1000 && bil3 < 10000);
    }   
}




