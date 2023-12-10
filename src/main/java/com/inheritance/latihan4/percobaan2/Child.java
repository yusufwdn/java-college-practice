/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance.latihan4.percobaan2;

/**
 *
 * @author USER
 */
public class Child {
    int x;
    public Child() {
        // contoh error, karena method super seharusnya dijalankan di awal konstruktor
        // x = 5;
        // super();
        
        // contoh benar
         super();
         x = 5;
        
    }
}
