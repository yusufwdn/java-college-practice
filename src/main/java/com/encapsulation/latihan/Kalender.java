/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.encapsulation.latihan;

/**
 *
 * @author USER
 */
public class Kalender {
    private int tanggal;
    private int bulan;
    private int tahun;
    
    public Kalender()
    {
        this.tanggal = 1;
        this.bulan = 1;
        this.tahun = 2000;
    }
    
    public Kalender(int tanggal)
    {
        this.tanggal = tanggal;
        this.bulan = 1;
        this.tahun = 2000;
    }
    
    public Kalender(int bulan, int tahun)
    {
        this.tanggal = 1;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public Kalender(int tanggal, int bulan, int tahun)
    {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public int getTanggal()
    {
        return this.tanggal;
    }
    
    public int getBulan()
    {
        return this.bulan;
    }
    
    public int getTahun()
    {
        return this.tahun;
    }
    
    public void setTanggal(int tanggal)
    {
        this.tanggal = tanggal;
    }
    
    public void setBulan(int bulan)
    {
        this.bulan = bulan;
    }
    
    public void setTahun(int tahun)
    {
        this.tahun = tahun;
    }
}
