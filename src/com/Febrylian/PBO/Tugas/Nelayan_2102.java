package com.Febrylian.PBO.Tugas;

public class Nelayan_2102 extends Penduduk_2102 {
    private int jmlBeratIkan_2102;
    private int jmlSolar_2102;

    public Nelayan_2102(String nik_2102, String nama_2102, int umur_2102, String alamat_2102, int jmlBeratIkan_2102, int jmlSolar_2102) {
        super(nik_2102, nama_2102, umur_2102, alamat_2102, "Nelayan");
        this.jmlBeratIkan_2102 = jmlBeratIkan_2102;
        this.jmlSolar_2102 = jmlSolar_2102;
    }

    public int getJmlBeratIkan_2102() {
        return jmlBeratIkan_2102;
    }

    public void setJmlBeratIkan_2102(int jmlBeratIkan_2102) {
        this.jmlBeratIkan_2102 = jmlBeratIkan_2102;
    }

    public int getJmlSolar_2102() {
        return jmlSolar_2102;
    }

    public void setJmlSolar_2102(int jmlBeratIkan_2102) {
        this.jmlSolar_2102 = jmlSolar_2102;
    }

    public double totalPendapatanNelayan_2102() {
        return (jmlBeratIkan_2102 * 8000) - (jmlSolar_2102 * 10000);
    }

    public void tampilDataNelayan_2102() {
        System.out.println("NIK   : " + getNik_2102());
        System.out.println("Nama  : " + getNama_2102());
        System.out.println("Umur  : " + getUmur_2102());
        System.out.println("Alamat: " + getAlamat_2102());
        System.out.println("Peran : " + getPeran_2102());
        System.out.println("Berat Ikan   : " + jmlBeratIkan_2102);
        System.out.println("Pakai Solar  : " + jmlSolar_2102);
        System.out.println("Pendapatan   : " + totalPendapatanNelayan_2102());
    }
}

