/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.sekolah;

/**
 *
 * @author USER
 */
public class Kelas {
    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;
    
    public Kelas(int kode, String nama){
        this.kodeKelas = kode;
        this.namaKelas = nama;
    }
    
    public void setMahasiswa(Mahasiswa mhs) {
        this.mahasiswa = mhs;
    }
    
    public void printData() {
        System.out.println("====== Mahasiswa ======");
        System.out.println("NRP  : " + this.mahasiswa.getNrp());
        System.out.println("Nama : " + this.mahasiswa.getNama());
        System.out.println("====== Kelas ======");
        System.out.println("Kode : " + this.kodeKelas);
        System.out.println("Nama : " + this.namaKelas);
    }
}
