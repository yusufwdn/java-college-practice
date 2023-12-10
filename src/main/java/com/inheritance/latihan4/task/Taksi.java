/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance.latihan4.task;

/**
 *
 * @author USER
 */
public class Taksi extends Mobil {
    public int tarifAwal;
    public int tarifPerKm;
    
    public Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKm) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        
        this.setTarifAwal(tarifAwal);
        this.setTarifPerKm(tarifPerKm);
    }
    
    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }
    
    public int getTarifAwal() {
        return this.tarifAwal;
    }
    
    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
    
    public int getTarifPerKm() {
        return this.tarifPerKm;
    }
}
