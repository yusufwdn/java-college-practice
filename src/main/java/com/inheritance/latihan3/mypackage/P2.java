/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance.latihan3.mypackage;

/**
 *
 * @author USER
 */

// walaupun pada class P1 tidak ada access modifier, P2 masih bisa extends ke P1
public class P2 extends P1{
    public static void main(String argv[]){
        P2 p2 = new P2();
        p2.aFancyMethod();
    }
}
