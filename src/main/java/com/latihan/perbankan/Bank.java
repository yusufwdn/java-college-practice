/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.perbankan;

/**
 *
 * @author USER
 */
public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;
    
    public Bank() {
        this.nasabah = new Nasabah[100];
        this.jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir) {
        Nasabah[] nasabah = this.nasabah;
        int jumlahNasabah = this.jumlahNasabah;
                
        Nasabah nasabahBaru = new Nasabah(namaAwal, namaAkhir);
        
        nasabah[jumlahNasabah] = nasabahBaru;
        jumlahNasabah++;
        
        this.nasabah = nasabah;
        this.jumlahNasabah = jumlahNasabah;
    }
    
    public int getJumlahNasabah(){
        return this.jumlahNasabah;
    }
    
    public Nasabah getNasabah(int index) {
        return this.nasabah[index];
    }
}
