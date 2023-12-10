/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.encapsulation.latihan;

/**
 *
 * @author USER
 */
public class Truk {
    private double muatan;
    private final double muatanMaks;
    private final double newtsInKilo = 9.8;
    
    public Truk(double beratMaks)
    {
        this.muatanMaks = beratMaks;
    }
    
    public double getMuatan()
    {
        return this.muatan;
    }
    
    public double getMuatanMaks()
    {
        return this.muatanMaks;
    }
    
    public boolean tambahMuatan(double berat)
    {
        double temp = this.muatan + berat;
        if(temp > this.muatanMaks) {
            return false;
        } else {
            this.muatan += berat;
            return true;
        }
    }
    
    public double newtsToKilo(double berat)
    {
        return berat / this.newtsInKilo;
    }
    
    public double kiloToNewts(double berat)
    {
        return berat * this.newtsInKilo;
    }
}
