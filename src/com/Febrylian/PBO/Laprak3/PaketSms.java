package com.Febrylian.PBO.Laprak3;

public class PaketSms {
    String namapaket;
    String benefitPaket;
    int biayaPaket;

    public PaketSms(){}

    public PaketSms(String namapaket, String benefitPaket, int biayaPaket) {
        this.namapaket = namapaket;
        this.benefitPaket = benefitPaket;
        this.biayaPaket = biayaPaket;
    }

    public void showinfo(){
        System.out.println("Nama Paket : " + namapaket);
        System.out.println("Benefit : " + benefitPaket);
        System.out.println("Biaya : " + biayaPaket);
        System.out.println();
    }

}
