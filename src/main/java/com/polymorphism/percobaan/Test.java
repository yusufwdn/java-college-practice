/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism.percobaan;

/**
 *
 * @author USER
 */
public class Test {
    /*
    * Virtual Method Invocation (VMI) 
    *
    * Bisa terjadi jika terjadi polimorfisme dan overriding. Pada saat obyek yang 
    * sudah dibuat tersebut memanggil overridden method pada parent class, kompiler 
    * Java akan melakukan invocation (pemanggilan) terhadap overriding method pada 
    * subclass, dimana yang seharusnya dipanggil adalah overridden method. 
    *
    */

    public static void main(String args[]) {
        /*
        * Inisiasi kelas Child dengan type object Parent
        *
        * Apa yang akan terjadi?
        * Karena Child melakukan extends ke Parent, maka properti yang diambil
        * adalah milik parent, namun methodnya tetap mengambil milik kelas Child
        */

        Parent parentTest = new Child();
        Child childTest = new Child();

        System.out.println("Nilai x = " + parentTest.x);
        parentTest.Info();

        System.out.println("Nilai x = " + childTest.x);
        childTest.Info();
    }
}