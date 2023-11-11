/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan3.inheritance.overriding;

/**
 *
 * @author USER
 */
public class HankyPanky extends HumptyDumpty {
    // jika pada kelas induk method tidak diberi akses modifier, 
    // maka di child method ini bebas diberikan modifier apa saja
    
    // jika pada kelas induk method diberi akses modifier, maka 
    // di kelas child tidak dapat menurunkan visibilitas dari kelas induknya.
    // misal di parent ada method yg protected, maka di child tidak boleh 
    // menggunakan private. tapi bisa menggunakan public dan protected
    
    void myMethod() {}
}
