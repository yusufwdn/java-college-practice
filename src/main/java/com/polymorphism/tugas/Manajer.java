/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism.tugas;

/**
 *
 * @author USER
 */
public class Manajer extends Pegawai {
    public int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan)
    {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int infoGaji()
    {
        return this.gaji;
    }

    public int infoTunjangan()
    {
        return this.tunjangan;
    }
}