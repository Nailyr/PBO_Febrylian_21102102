package com.Febrylian.PBO.Laprak4;

public class Kucing extends Peliharaan {
    public Kucing() {}

    public Kucing(String namaKucing, int umurKucing){
        namaKucing = nama;
        umurKucing = umur;
    }

    public void mengeong(){
        System.out.println("Kucing : Ngeong!");
        System.out.println();
    }
}
