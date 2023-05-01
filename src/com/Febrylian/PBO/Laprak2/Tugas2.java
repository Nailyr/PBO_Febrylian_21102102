package com.Febrylian.PBO.Laprak2;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama Anda : ");
        String nama = input.nextLine();
        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut");

        System.out.println("Masukkan gaji : ");
        int gaji = input.nextInt();
        System.out.println("Masukkan tunjangan : ");
        int tunjangan = input.nextInt();
        double pajak = 0.0765;

        int Gaji_kotor = gaji + tunjangan;
        double Pajak_negara = Gaji_kotor*pajak;
        double Gaji_bersih = Gaji_kotor - Pajak_negara;

        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + Gaji_bersih + ".");
    }

}
