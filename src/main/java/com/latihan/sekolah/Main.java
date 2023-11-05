/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.sekolah;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String []args) {
        Mahasiswa mahasiswaBaru = new Mahasiswa(11701829, "Heri Kusnaedi");
        Kelas kelasBaru = new Kelas(108, "Ruang Belajar");
        kelasBaru.setMahasiswa(mahasiswaBaru);
        kelasBaru.printData();
    }
}
