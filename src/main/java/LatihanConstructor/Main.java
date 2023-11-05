/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanConstructor;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // inisiasi objek baru dari kelas Manusia melalui constructor awal
        Manusia orang1 = new Manusia();
        orang1.setNama("Test Nama");
        orang1.setUmur(24);
        orang1.getCetak();
        
        // inisiasi objek baru dari kelas Manusia melalui constructor kedua
        Manusia orang2 = new Manusia("Test 2");
        orang2.getCetak();
        
        // inisiasi objek baru dari kelas Manusia melalui constructor ketiga
        Manusia orang3 = new Manusia("Test 3", 27);
        orang3.getCetak();
    }
}
