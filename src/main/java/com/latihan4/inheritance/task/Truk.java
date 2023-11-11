/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan4.inheritance.task;

/**
 *
 * @author USER
 */
public class Truk extends Mobil {
    public int muatanMaks;
    
    public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        
        this.setMuatanMaks(muatanMaks);
    }
    
    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }
    
    public int getMuatanMaks() {
        return this.muatanMaks;
    }
}
