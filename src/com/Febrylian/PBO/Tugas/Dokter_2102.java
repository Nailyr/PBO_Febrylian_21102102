package com.Febrylian.PBO.Tugas;

public class Dokter_2102 extends Penduduk_2102 {
    private int jmlPasien_2102;
    private int jmlObat_2102;

    public Dokter_2102(String nik_2102, String nama_2102, int umur_2102, String alamat_2102, int jmlObat_2102, int jmlPasien_2102) {
        super(nik_2102, nama_2102, umur_2102, alamat_2102, "Dokter");
        this.jmlPasien_2102 = jmlPasien_2102;
        this.jmlObat_2102 = jmlObat_2102;
    }

    public double totalPendapatanDokter_2102() {
        return (jmlPasien_2102 * 50000) + (jmlObat_2102 * 10000);
    }

    public void tampilDataDokter_2102() {
        System.out.println("NIK : " + getNik_2102());
        System.out.println("Nama : " + getNama_2102());
        System.out.println("Umur : " + getUmur_2102());
        System.out.println("Alamat : " + getAlamat_2102());
        System.out.println("Jumlah Pasien : " + jmlPasien_2102);
        System.out.println("Jumlah Obat : " + jmlObat_2102);
        System.out.println("Pendapatan : " + totalPendapatanDokter_2102());
    }

}