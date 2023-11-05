/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.example;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    public int nrp;
    public String nama;
    
    // memanggil konstruktor Mahasiswa dengan memberikan parameter nilai kosong pada property 
    // nrp dan nama
    public Mahasiswa() {
        this(0,"");
    }
    
    // memanggil konstruktor Mahasiswa dengan memberikan parameter nilai kosong pada property
    // nrp dan memberikan value pada nama dari parameter yang baru.
    public Mahasiswa(String nama) {
        this(0, nama);
    }
    
    // inisiasi konstruktor dengan tujuan untuk menginisiasi dan memberi valu pada dua property
    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
}
