/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.sekolah;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    private int nrp;
    private String nama;
    
    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
    
    public int getNrp() {
        return this.nrp;
    }
    
    public String getNama() {
        return this.nama;
    }
}
