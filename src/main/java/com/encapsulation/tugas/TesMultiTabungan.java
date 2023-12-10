/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.encapsulation.tugas;

/**
 *
 * @author USER
 */
public class TesMultiTabungan {
    public static void main(String args[]) {
        boolean status;
        MultiTabungan multiTabungan = new MultiTabungan(2000000);
        System.out.println("Saldo awal = " + multiTabungan.getSaldo());
        
        multiTabungan.simpanUang(500000, "IDR");
        System.out.println("Simpan uang sejumlah 500000 IDR");
        multiTabungan.getTextSaldoSaatIni();
        
        multiTabungan.simpanUang(10, "AUD");
        System.out.println("Simpan uang sejumlah 10 AUD");
        multiTabungan.getTextSaldoSaatIni();
        
        multiTabungan.simpanUang(10, "USD");
        System.out.println("Simpan uang sejumlah 10 USD");
        multiTabungan.getTextSaldoSaatIni();
        
        status = multiTabungan.ambilUang(3000000);
        System.out.println("Ambil uang sejumlah: 3000000");
        if (status)
            System.out.println("Berhasil");
        else
            System.out.println("Gagal, saldo tidak cukup.");
        
        multiTabungan.getTextSaldoSaatIni();
        
        status = multiTabungan.ambilUang(2000000);
        System.out.println("Ambil uang sejumlah: 2000000");
        if (status)
            System.out.println("Berhasil");
        else
            System.out.println("Gagal, saldo tidak cukup.");
        
        multiTabungan.getTextSaldoSaatIni();
    }
}
