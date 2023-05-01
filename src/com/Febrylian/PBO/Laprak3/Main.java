package com.Febrylian.PBO.Laprak3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PaketJasa game = new PaketJasa();
        PaketJasa stream = new PaketJasa();
        PaketJasa media = new PaketJasa();

        PaketSms lite = new PaketSms();
        PaketSms medium = new PaketSms();
        PaketSms big = new PaketSms();

        game.namaPaket = "Paket Gamepack";
        game.benefit = "Kuota Utama 2gb + Kuota game 6gb";
        game.biaya = 50000;

        stream.namaPaket = "Paket Streampack";
        stream.benefit = "Kuota Utama 2gb + Kuota Stream Youtube 3gb + Kuota Netflix 4gb";
        stream.biaya = 52000;

        media.namaPaket = "Paket Mediapack";
        media.benefit = "Kuota Utama 2gb + Kuota Sosial Media 5gb";
        media.biaya = 40000;

        lite.namapaket = "Paket Lite";
        lite.benefitPaket = "SMS sebanyak 30 kali ke semua operator";
        lite.biayaPaket = 3000;

        medium.namapaket = "Paket Medium";
        medium.benefitPaket = "SMS sebanyak 50 kali ke semua operator";
        medium.biayaPaket = 5000;

        big.namapaket = "Paket Big";
        big.benefitPaket = "SMS sebanyak 100 kali ke semua operator";
        big.biayaPaket = 10000;

        System.out.println("Daftar Paket yang Tersedia : ");
        System.out.println("1. Paket Internet");
        System.out.println("2. Paket SMS");
        System.out.println("Masukkan pilihan anda : ");

        String pil1 = input.nextLine();

        if (pil1.equals("1")){
            game.showInfo();
            stream.showInfo();
            media.showInfo();

            System.out.println("Masukkan pilihan anda : ");
            String pil = input.nextLine();

            if (pil.equals("Gamepack")){
                System.out.println("Paket yang anda pilih adalah : ");
                System.out.println("Nama Paket : " + game.namaPaket);
                System.out.println("Benefit : " + game.benefit);
                System.out.println("Total biaya yang dibayarkan adalah : " + game.biaya);
            } else if (pil.equals("Streampack")){
                System.out.println("Paket yang anda pilih adalah : ");
                System.out.println("Nama Paket : " + stream.namaPaket);
                System.out.println("Benefit : " + stream.benefit);
                System.out.println("Total biaya yang dibayarkan adalah : " + stream.biaya);
            } else if (pil.equals("Mediapack")) {
                System.out.println("Paket yang anda pilih adalah : ");
                System.out.println("Nama Paket : " + media.namaPaket);
                System.out.println("Benefit : " + media.benefit);
                System.out.println("Total biaya yang dibayarkan adalah : " + media.biaya);
            } else {
                System.out.println("Paket yang anda pilih tidak tersedia!");
            }
        } else if (pil1.equals("2")){
            lite.showinfo();
            medium.showinfo();
            big.showinfo();

            System.out.println("Masukkan pilihan anda : ");
            String pil = input.nextLine();

            if (pil.equals("Lite")){
                System.out.println("Paket yang anda pilih adalah : ");
                System.out.println("Nama Paket : " + lite.namapaket);
                System.out.println("Benefit : " + lite.benefitPaket);
                System.out.println("Total biaya yang dibayarkan adalah : " + lite.biayaPaket);
            } else if (pil.equals("Medium")){
                System.out.println("Paket yang anda pilih adalah : ");
                System.out.println("Nama Paket : " + medium.namapaket);
                System.out.println("Benefit : " + medium.benefitPaket);
                System.out.println("Total biaya yang dibayarkan adalah : " + medium.biayaPaket);
            } else if (pil.equals("Big")) {
                System.out.println("Paket yang anda pilih adalah : ");
                System.out.println("Nama Paket : " + big.namapaket);
                System.out.println("Benefit : " + big.benefitPaket);
                System.out.println("Total biaya yang dibayarkan adalah : " + big.biayaPaket);
            } else {
                System.out.println("Paket yang anda pilih tidak tersedia!");
            }
        } else {
            System.out.println("Pilihan anda tidak tersedia!");
        }
    }
}
