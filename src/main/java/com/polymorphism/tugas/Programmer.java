/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism.tugas;

/**
 *
 * @author USER
 */
public class Programmer extends Pegawai {
    public int bonus;

    public Programmer(String nama, int gaji, int bonus)
    {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int infoGaji()
    {
        return this.gaji;
    }

    public int infoBonus()
    {
        return this.bonus;
    }
}