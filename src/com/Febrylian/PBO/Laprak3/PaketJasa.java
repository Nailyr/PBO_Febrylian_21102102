package com.Febrylian.PBO.Laprak3;

public class PaketJasa {
    String namaPaket;
    String benefit;
    int biaya;

    // Constructor
    public PaketJasa(){}

    public PaketJasa(String namaPaket, String benefit, int biaya){
        this.namaPaket = namaPaket;
        this.benefit = benefit;
        this.biaya = biaya;
    }

    public void showInfo(){
        System.out.println("Nama Paket : " + namaPaket);
        System.out.println("Benefit : " + benefit);
        System.out.println("Biaya : " + biaya);
        System.out.println();
    }
}
