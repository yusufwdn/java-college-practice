/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism.tugas;

/**
 *
 * @author USER
 */
public class Pegawai {
    public String nama;
    public int gaji;

    public Pegawai(String nama, int gaji)
    {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji()
    {
        return this.gaji;
    }
}