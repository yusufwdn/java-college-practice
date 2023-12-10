/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.encapsulation.tugas;

/**
 *
 * @author USER
 */
public class MultiTabungan {
    private int saldo;
    private final int audInIdr = 10000;
    private final int usdInIdr = 9000;
    
    public MultiTabungan(int saldo)
    {
        this.saldo = saldo;
    }
    
    public int getSaldo()
    {
        return this.saldo;
    }
    
    public void simpanUang(int jumlah, String mataUang)
    {
        if (jumlah > 0) {
            switch (mataUang) {
                case "IDR" -> this.saldo += jumlah;
                
                case "AUD" -> {
                    jumlah *= this.audInIdr;
                    this.saldo += jumlah;
                }
                    
                case "USD" -> {
                    jumlah *= this.usdInIdr;
                    this.saldo += jumlah;
                }
                default -> System.out.println("Mata uang tidak dikenali");
            }
        } else {
            System.out.println("Jumlah tidak boleh kurang dari nol.");
        }
    }
    
    public boolean ambilUang(int jumlah)
    {
        int temp = this.saldo - jumlah;
        if (temp < 0) {
            return false;
        } else {
            this.saldo -= jumlah;
            return true;
        }
    }
    
    public void getTextSaldoSaatIni()
    {
        int saldo = this.getSaldo();
        
        System.out.println("Saldo saat ini berjumlah: " + saldo + "\n");
    }
}
