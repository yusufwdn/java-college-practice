/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.test;

import com.latihan.perbankan.*;

/**
 *
 * @author USER
 */
public class TestTugas {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.tambahNasabah("Agus", "Daryanto");
        bank.getNasabah(0).setTabungan(new Tabungan(5000));
        bank.tambahNasabah("Tuti", "Irawan");
        bank.getNasabah(1).setTabungan(new Tabungan(7000));
        bank.tambahNasabah("Ani", "Ratna");
        bank.getNasabah(2).setTabungan(new Tabungan(4000));
        bank.tambahNasabah("Bambang", "Darmawan");
        bank.getNasabah(3).setTabungan(new Tabungan(6500));
        
        System.out.println("Jumlah nasabah = " + bank.getJumlahNasabah());
        
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah getNasabah = bank.getNasabah(i);
            String  namaLengkapNasabah = getNasabah.getNamaAwal() + " " + getNasabah.getNamaAkhir();
            int     saldo = getNasabah.getTabungan().getSaldo();
            
            System.out.println("Nasabah ke-" + (i+1) + " : " + namaLengkapNasabah + "; Saldo = " + saldo);
        }
    }
}
