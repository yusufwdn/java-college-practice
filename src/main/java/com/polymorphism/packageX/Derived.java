/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism.packageX;

/**
 *
 * @author USER
 */
public class Derived extends Base {
    int i = -1;

    public static void main(String argv[]){
        // Buat sebuah instance dari Derived dan tetapkan ke referensi Base
        Base b = new Derived();

        // Menampilkan value i milik Base
        System.out.println(b.i);

        // Eksekusi amethod() milik Base (yang akan memanggil metode yang diganti di Derived)
        b.amethod();
    }

    @Override
    public void amethod(){
        System.out.println("Derived.amethod()");
    }
}