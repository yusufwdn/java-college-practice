/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan4.inheritance.base;

/**
 *
 * @author USER
 */

// konstruktor dalam kelas X dijalankan paling pertama dengan menghasilkan output: YX
// dilanjutkan pemanggilan kelas Y yang di dalamnya terdapat konstruktor Y yang menghasilkan output: Y
// terakhir, konstruktor Z dijalankan dengan menghasilkan output: Z

public class Z extends X {
    Y y = new Y();
    
    Z(){
        System.out.print("Z");
    }
    
    public static void main(String[] args){
        new Z();
    }
}
