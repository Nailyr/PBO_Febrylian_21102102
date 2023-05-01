package com.Febrylian.PBO.Laprak4;

public class Main {
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        Anjing anjingku = new Anjing();
        Peliharaan peliharaanku = new Peliharaan();

        kucingku.nama = "Mochi";
        kucingku.umur = 2;

        anjingku.nama = "Yuki";
        anjingku.umur = 1;

        peliharaanku.nama = "Shiro";
        peliharaanku.umur = 3;

        kucingku.showInfo();
        kucingku.makan();
        kucingku.minum();
        kucingku.bergerak();
        kucingku.mengeong();

        anjingku.showInfo();
        anjingku.makan();
        anjingku.minum();
        anjingku.bergerak();
        anjingku.menggonggong();

        peliharaanku.showInfo();
    }
}

