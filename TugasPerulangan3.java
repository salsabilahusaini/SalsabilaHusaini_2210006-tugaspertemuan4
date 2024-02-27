/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperulangan3;

import java.util.Scanner;
public class TugasPerulangan3 {
    public static void main(String[] args) {
        Scanner pola = new Scanner(System.in);
        
        System.out.println("Masukkan nilai N antara 1 sampai 1000:");
        int N = pola.nextInt();
        if(N >=1 && N <=1000){
            // cetak pola sesuai N
                System.out.println("N=" + N);
                printPola(N);
        }else{
            System.out.println("Nilai N harus antara 1 sampai 1000");
        }
        pola.close();
    }
    // Fungsi untuk mencetak pola
    public static void printPola(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

