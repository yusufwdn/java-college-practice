/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itbs.praktik.basic.oop;

/**
 *
 * @author YUSUF
 */
public class Mobil {
    public String name;
    public String color;
    public int speed = 0;
    
    public void addSpeed(int speed){
        this.speed += speed;
        System.out.println("Kecepatan mobil bertambah sebesar " + speed);
    }
    
    public void getCurrentSpeed() {
        System.out.println("Kecepatan saat ini: " + this.speed);
    }
    
    public void getIdentity() {
        System.out.println("Nama mobil saya " + this.name + ", dan warnanya " + this.color);
    }
    
    public void stop() {
        this.speed = 0;
        System.out.println("Mobil telah berhenti. Kecepatan saat ini " + this.speed);
    }
}
