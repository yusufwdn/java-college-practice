/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBasic;

/**
 *
 * @author YUSUF
 */
public class Mobil {
    public String nama, warna, jenis;
    public int tarif, durasi;

    public Mobil(String nama, String warna, String jenis, int tarif, int durasi) {
        this.nama = nama;
        this.warna = warna;
        this.jenis = jenis;
        this.tarif = tarif;
        this.durasi = durasi;
    }

    public void infoMobil() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("Warna : " + this.warna);
        System.out.println("Jenis : " + this.jenis);
        System.out.println("Tarif : " + this.tarif);
        System.out.println("Durasi: " + this.durasi + " jam");
        System.out.println("=====================");
    }
}
