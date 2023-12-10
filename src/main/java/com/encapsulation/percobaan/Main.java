/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.encapsulation.percobaan;

/**
 *
 * @author USER
 */
public class Main 
{
    public static void main(String []args)
    {   
        System.out.println("Inisiasi kelas Mahasiswa tanpa memberi parameter.");
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("NRP : " + mhs1.getNrp());
        
        System.out.println("=================================================");
        
        System.out.println("Inisiasi kelas Mahasiswa dengan memberi parameter.");
        Mahasiswa mhs2 = new Mahasiswa(221232017, "Alex O'connor");
        System.out.println("Nama: " + mhs2.getNama());
        System.out.println("NRP : " + mhs2.getNrp());
    }
}
