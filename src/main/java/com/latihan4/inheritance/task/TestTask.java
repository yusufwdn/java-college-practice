/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan4.inheritance.task;

/**
 *
 * @author USER
 */
public class TestTask {
    public static void main(String[] args) {
        Truk truk1 = new Truk(4, "kuning", "solar", 1500,1000);
        Truk truk2 = new Truk(6, "merah", "solar", 2000,5000);
        
        Taksi taksi1 = new Taksi(4, "kuning", "solar", 1500,1000,0);
        Taksi taksi2 = new Taksi(6, "merah", "solar", 2000,5000,0);
        
        Sepeda sepeda1 = new Sepeda(3, "hitam", 1, 2);
        Sepeda sepeda2 = new Sepeda(2, "putih", 2, 5);
        
        System.out.println("TRUK 1");
        System.out.println("Jumlah Roda : " + truk1.jmlRoda);
        System.out.println("Warna : " + truk1.warna);
        System.out.println("Bahan Bakar : " + truk1.bahanBakar);
        System.out.println("Kapasitas Mesin : " + truk1.kapasitasMesin);
        System.out.println("Muatan Maks : " + truk1.muatanMaks);
        
        System.out.println("====================");
        
        System.out.println("TRUK 2");
        System.out.println("Jumlah Roda : " + truk2.jmlRoda);
        System.out.println("Warna : " + truk2.warna);
        System.out.println("Bahan Bakar : " + truk2.bahanBakar);
        System.out.println("Kapasitas Mesin : " + truk2.kapasitasMesin);
        System.out.println("Muatan Maks : " + truk2.muatanMaks);
        
        System.out.println("====================");
        
        System.out.println("Taksi 1");
        System.out.println("Jumlah Roda : " + taksi1.jmlRoda);
        System.out.println("Warna : " + taksi1.warna);
        System.out.println("Bahan Bakar : " + taksi1.bahanBakar);
        System.out.println("Kapasitas Mesin : " + taksi1.kapasitasMesin);
        System.out.println("Tarif Awal : " + taksi1.tarifAwal);
        System.out.println("Tarif per KM : " + taksi1.tarifPerKm);
        
        System.out.println("====================");
        
        System.out.println("Taksi 2");
        System.out.println("Jumlah Roda : " + taksi2.jmlRoda);
        System.out.println("Warna : " + taksi2.warna);
        System.out.println("Bahan Bakar : " + taksi2.bahanBakar);
        System.out.println("Kapasitas Mesin : " + taksi2.kapasitasMesin);
        System.out.println("Tarif Awal : " + taksi2.tarifAwal);
        System.out.println("Tarif per KM : " + taksi2.tarifPerKm);
        
        System.out.println("====================");
        
        System.out.println("SEPEDA 1");
        System.out.println("Jumlah Roda : " + sepeda1.jmlRoda);
        System.out.println("Warna : " + sepeda1.warna);
        System.out.println("Jumlah Sadel : " + sepeda1.jmlSadel);
        System.out.println("Jumlah Gir : " + sepeda1.jmlGir);
        
        System.out.println("====================");
        
        System.out.println("SEPEDA 2");
        System.out.println("Jumlah Roda : " + sepeda2.jmlRoda);
        System.out.println("Warna : " + sepeda2.warna);
        System.out.println("Jumlah Sadel : " + sepeda2.jmlSadel);
        System.out.println("Jumlah Gir : " + sepeda2.jmlGir);
    }
}
