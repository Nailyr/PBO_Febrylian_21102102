package com.Febrylian.PBO.Laprak4;

public class Peliharaan {
    String nama;
    int umur;

    public Peliharaan(){}

    public void showInfo(){
        System.out.println("Nama peliharaan : " + nama);
        System.out.println("Umur peliharaan : " + umur);
    }

    public void makan(){
        System.out.println("Peliharaan : Makan");
    }

    public void minum(){
        System.out.println("Peliharaan : Minum");
    }

    public void bergerak(){
        System.out.println("Peliharaan : Bergerak");
    }
}
