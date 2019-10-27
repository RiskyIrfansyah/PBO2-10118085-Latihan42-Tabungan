/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * NIM      : 10118085
 * Deskripsi Program : Membuat program berbasis object untuk menghitung tabungan
 */
public class PBO210118085Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : "
                + tabungan.ambilUang(scanner.nextInt()));
    }
    
}