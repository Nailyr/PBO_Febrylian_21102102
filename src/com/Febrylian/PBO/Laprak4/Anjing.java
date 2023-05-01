package com.Febrylian.PBO.Laprak4;

public class Anjing extends Peliharaan{
    public Anjing() {}

    public Anjing(String namaAnjing, int umurAnjing){
        namaAnjing = nama;
        umurAnjing = umur;
    }

    public void menggonggong(){
        System.out.println("Anjing : Woof-woof!");
        System.out.println();
    }
}
