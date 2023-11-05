/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itbs.praktik.basic.oop;

/**
 *
 * @author YUSUF
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Beelzebub";
        System.out.println("Hai, nama saya " + person1.name);
        
        Person person2 = new Person();
        person2.name = "Gol D. Roger";
        person2.cetakNama();
    }
}
