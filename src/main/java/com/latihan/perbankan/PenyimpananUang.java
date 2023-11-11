/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.perbankan;

/**
 *
 * @author USER
 */
public class PenyimpananUang extends Tabungan {
    public double tingkatBunga;
    
    public PenyimpananUang(int saldo) {
        super(saldo); // Panggil konstruktor kelas induk dengan super
    }
    
    public PenyimpananUang(int saldo, double tingkatBunga) {
        super(saldo); // Panggil konstruktor kelas induk dengan super
        
        this.tingkatBunga = tingkatBunga;
    }
    
    public double cekUang() {        
        double nominalBunga = this.saldo * this.tingkatBunga;
        
        this.saldo += nominalBunga;
                
        return this.saldo;
    }
}
