package com.Febrylian.PBO.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nelayan_2102[] nelayan_2102 = new Nelayan_2102[2];
        Dokter_2102[] dokter_2102 = new Dokter_2102[2];
        int totalPendapatan_2102 = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Input data penduduk ke-" + (i+1));
            System.out.print("NIK : ");
            String nik_2102 = input.nextLine();

            System.out.print("Nama : ");
            String nama_2102 = input.nextLine();

            System.out.print("Umur : ");
            int umur_2102 = input.nextInt();
            input.nextLine();

            System.out.print("Alamat : ");
            String alamat_2102 = input.nextLine();

            System.out.print("Peran (Nelayan/Dokter) : ");
            String peran_2102 = input.nextLine();

            if (peran_2102.equalsIgnoreCase("Nelayan")) {
                System.out.print("Jumlah Berat Ikan : ");
                int beratIkan = input.nextInt();
                input.nextLine();

                System.out.print("Jumlah Pemakaian Solar : ");
                int pemakaianSolar = input.nextInt();
                input.nextLine();

                Nelayan_2102 nelayanku_2102 = new Nelayan_2102(nik_2102, nama_2102, umur_2102, alamat_2102, beratIkan, pemakaianSolar);
                nelayan_2102[i] = nelayanku_2102;

            } else if (peran_2102.equalsIgnoreCase("Dokter")) {
                System.out.print("Jumlah Pasien : ");
                int jumlahPasien = input.nextInt();
                input.nextLine();

                System.out.print("Jumlah Obat : ");
                int jumlahObat = input.nextInt();
                input.nextLine();

                Dokter_2102 dokterku_2102 = new Dokter_2102(nik_2102, nama_2102, umur_2102, alamat_2102, jumlahPasien, jumlahObat);
                dokter_2102[i] = dokterku_2102;
            }
        }

        System.out.println("\nData Nelayan");
        for (Nelayan_2102 nelayan2102 : nelayan_2102) {
            if (nelayan2102 != null) {
                nelayan2102.tampilDataNelayan_2102();
                totalPendapatan_2102 += nelayan2102.totalPendapatanNelayan_2102();
            }
        }

        System.out.println("\nData Dokter");
        for (Dokter_2102 dokter2102 : dokter_2102) {
            if (dokter2102 != null) {
                dokter2102.tampilDataDokter_2102();
                totalPendapatan_2102 += dokter2102.totalPendapatanDokter_2102();
            }
        }
    }
}

