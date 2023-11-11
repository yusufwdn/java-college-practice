/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.perbankan;

/**
 *
 * @author USER
 */
public class PengambilanUang extends Tabungan {
    public int proteksi;
    
    public PengambilanUang(int saldo) {
        super(saldo);
    }
    
    public PengambilanUang(int saldo, int proteksi)  {
        super(saldo);
        this.proteksi = proteksi;
    }
    
    // timpa logika dan fungsi di dalam method ambilUang() milik Tabungan()
    public boolean ambilUang(int jumlah) {
        int saldo = super.saldo;
        int proteksi = this.proteksi;
        int saldoMinimum = saldo - proteksi;
        
        if (jumlah <= saldoMinimum) {
            super.ambilUang(jumlah);
            
            return true;
        }
        
        return false;
    }
    
    // timpa logika dan fungsi di dalam method getSaldo() milik Tabungan()
    public int getSaldo() {
        return super.saldo;
    }
}
