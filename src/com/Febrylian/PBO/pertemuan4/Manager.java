package com.Febrylian.PBO.pertemuan4;

public class Manager extends Pegawai {
    public void bonus(int bonus){
        System.out.println("Pegawai atas nama : " + nama + " (" + nip + ") mendapat bonus sebesar " + bonus);
    }

    public void extraInfo(){
        System.out.println("Jabatan pegawai : Manajer");
    }

    public void bonus(){
        System.out.println("Error : harap masukkan nominal bonus!");
    }
}
