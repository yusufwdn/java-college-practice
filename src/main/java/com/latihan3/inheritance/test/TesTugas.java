/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan3.inheritance.test;

import com.latihan.perbankan.*;

/**
 *
 * @author USER
 */
public class TesTugas {
    public static void main(String args[]){
        // Expected Result
        // Uang yang ditabung : 5000
        // Uang yang diproteksi : 1000
        // Uang yang akan diambil : 4500 false
        // Saldo sekarang : 5000
        // Uang yang akan diambil : 2500 true
        // Saldo sekarang : 2500

        PengambilanUang tabungan = new PengambilanUang(5000, 1000);
        System.out.println("Uang yang ditabung : 5000");
        System.out.println("Uang yang diproteksi : 1000");
        System.out.println(" ");
        System.out.println("Uang yang akan diambil : 4500 " +
        tabungan.ambilUang(4500));

        System.out.println("Saldo sekarang : " + tabungan.getSaldo());
        System.out.println(" ");
        System.out.println("Uang yang akan diambil : 2500 " +
        tabungan.ambilUang(2500));

        System.out.println("Saldo sekarang : " + tabungan.getSaldo());
    }
}
