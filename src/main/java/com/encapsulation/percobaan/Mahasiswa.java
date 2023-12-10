/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.encapsulation.percobaan;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    // menyembunyikan atribut milik kelas Mahasiswa dari kelas lain dengan keyword "private"
    private int nrp;
    private String nama;
    
    // konstruktor tanpa parameter
    public Mahasiswa()
    {
        nrp  = 0;
        nama = "";
    }
    
    // konstruktor dengan parameter nama saja
    public Mahasiswa(String nama)
    {
        nrp = 0;
        this.nama = nama;
    }
    
    // konstruktor dengan parameter nama dan nrp
    public Mahasiswa(int nrp, String nama)
    {
        this.nrp = nrp;
        this.nama = nama;
    }
    
    // method untuk mengambil nrp dan nama karena kelas lain tidak dapat mengakses properti 
    // tersebut secara langsung, melainkan harus melalui method terlebih dahulu (getter).
    public int getNrp()
    {
        return this.nrp;
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    // method untuk memberikan value ke dalam properti nrp dan nama karena kelas lain tidak dapat 
    // memberikan value secara langsung, jadi harus melalui method (setter)
    public int setNrp(int nrp)
    {
        this.nrp = nrp;
        
        return this.nrp;
    }
    
    public String setNama(String nama)
    {
        this.nama = nama;
        
        return this.nama;
    }
}
