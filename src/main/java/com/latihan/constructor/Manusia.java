/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.constructor;

/**
 *
 * @author USER
 */
public class Manusia {
    // deklarasi attribut / property
    private String nama;
    private int umur;
    
    // constructtor tanpa parameter dan tanpa aksi
    Manusia() {
        
    }
    
    // constructtor dengan parameter nama yang digunakan untuk set value property nama
    Manusia(String nama) {
        this.nama = nama;
    }
    
    // constructtor dengan parameter nama dan umur yang digunakan untuk set value property nama dan umur
    Manusia (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    // fungsi untuk set value property nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // fungsi untuk set value property umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    // fungsi untuk get value property nama
    public String getNama() {
        return this.nama;
    }
    
    // fungsi untuk get value property umur
    public int getUmur() {
        return this.umur;
    }
    
    public void getCetak() {
         System.out.println("Nama: " + this.nama);
         System.out.println("Umur: " + this.umur);
         System.out.println("================");
    }
}
