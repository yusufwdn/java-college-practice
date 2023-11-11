/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan4.inheritance.task;

/**
 *
 * @author USER
 */
public class Kendaraan {
    public int jmlRoda;
    public String warna;
    
    public Kendaraan(int jmlRoda, String warna) {
        this.setJmlRoda(jmlRoda);
        this.setWarna(warna);
    }
    
    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }
    
    public int getJmlRoda() {
        return this.jmlRoda;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getWarna(int jmlRoda) {
        return this.warna;
    }
}
