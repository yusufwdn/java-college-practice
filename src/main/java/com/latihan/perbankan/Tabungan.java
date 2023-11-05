/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.perbankan;

/**
 *
 * @author USER
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        int currentSaldo = this.saldo;
        
        if (currentSaldo > jumlah) {
            this.saldo -= jumlah;
            return true;
        } else {
            return false;
        }
        
    }
}
