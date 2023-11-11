/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan4.inheritance.task;

/**
 *
 * @author USER
 */
public class Mobil extends Kendaraan {
    public String bahanBakar;
    public int kapasitasMesin;
    
    public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda,warna);
        
        this.setBahanBakar(bahanBakar);
        this.setKapasitasMesin(kapasitasMesin);
    }
    
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    public String getBahanBakar() {
        return this.bahanBakar;
    }
    
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public int getKapasitasMesin() {
        return this.kapasitasMesin;
    }
}
