/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance.latihan3.base;

/**
 *
 * @author USER
 */

// base tetap dapat diekstend walaupun di kelas tersebut tidak ada akses modifier.
// karena menggunakan access modifier default, maka dibolehkan melakukan extends.
// akses modifier default dapat diakses oleh class yang sama dan package yang sama.
public class Class1 extends Base {
    public static void main(String argv[]){
        
        // membuat instance baru dari kelas Base
        Base b = new Base();
        b.amethod();
        
    } //End of main
}
