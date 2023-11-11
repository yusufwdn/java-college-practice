/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan4.inheritance.task;

/**
 *
 * @author USER
 */
public class Sepeda extends Kendaraan {
    public int jmlSadel;
    public int jmlGir;
    
    Sepeda(int jmlRoda, String warna, int jmlSadel, int jmlGir) {
        super(jmlRoda, warna);
        
        this.setJmlSadel(jmlSadel);
        this.setJmlGir(jmlGir);
    }
    
    public void setJmlSadel(int jmlSadel) {
        this.jmlSadel = jmlSadel;
    }
    
    public int getJmlSadel() {
        return this.jmlSadel;
    }
    
    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }
    
    public int getJmlGir() {
        return this.jmlGir;
    }
}
