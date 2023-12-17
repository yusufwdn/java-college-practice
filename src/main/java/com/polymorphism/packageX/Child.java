/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism.packageX;

/**
 *
 * @author USER
 */
public class Child extends Parent {
    public void method1() {
        System.out.println("Child's method1()");
    }

    public static void main(String args[]){
        Parent p = new Child();

        // Ketika membuat instance baru dari kelas Child dan tipe instance 
        // deklarasinya adalah kelas Parent. Maka ketika kita memanggil methodnya
        // maka hanya akan mengeksekusi method milik parent. Di sini method1 milik
        // kelas Child tidak dijalankan.
        p.method2();
    }
}