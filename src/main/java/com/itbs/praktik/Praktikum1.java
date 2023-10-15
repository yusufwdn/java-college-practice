/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itbs.praktik;

/**
 *
 * @author YUSUF
 */
public class Praktikum1 {
    public static void main(String[] args) {
        // Mendeklarasikan variable
        int number; // deklarasi variable integer
        String name; // deklarasi variable string

        // Menetapkan nilai variable
        number = 3;
        name = "John";

        // Menggunakan variable
        System.out.println(number);
        System.out.println(name);

        // Menginisiasikan variable: mendeklarasikan variable dan menetapkan nilai
        // secara bersamaan
        int myNumber = 2;
        String myText = "Hello world";
        System.out.println(myNumber);
        System.out.println(myText);

        // Kalkulasi dengan variable
        int number1 = 10;
        int number2 = 5;

        System.out.println(number1 + 3);
        System.out.println(number1 + number2);

        // Penggabungan variable
        String greeting = "Hello";
        String myName = "Kate";

        System.out.println(greeting + "John");
        System.out.println(greeting + myName);

        // Memperbarui variable
        myName = "Adolf";
        System.out.println(greeting + myName);

        // Memperbarui variable
        int x = 3;
        System.out.println(x);

        x = x + 2; // long hand
        System.out.println(x);

        x += 10; // short hand
        x -= 10; // short hand
        x *= 2; // short hand
        System.out.println(x);

        // Menambah dan mengurangi 1
        x++; // Menambahkan satu
        x--; // Mengurangi satu

        // Penulisan nama variable yang benar harus mendeskripsikan isi dari variable
        // tersebut, dan menggunakan camelCase
        String firstName = "Just test";
        System.out.println(firstName);

        // Tipe data desimal dengan double
        double doubleNumber = 5.28;
        System.out.println(doubleNumber);

        // Menghitung desimal
        double doubleNumberX = 8.5;
        double doubleNumberY = 7.3;
        System.out.println(doubleNumberX);
        System.out.println(doubleNumberY);

        // Konversi tipe data
        System.out.println("Saya berusia" + 25 + "tahun");

        // Aturan kalkulasi
        System.out.println(5 / 2); // pembagian dengan tipe integer
        System.out.println(5.0 / 2.0); // pembagian dengan tipe desimal

        // Kalkulasi int dan double
        System.out.println(5.0 / 2); // hasilnya akan menjadi desimal 2.5 (sama dengan 5.0 / 2.0 -> dirubah menjadi
                                     // desimal secara implisit)

        // Menghitung angka dengan tipe integer
        int numberX = 13;
        int numberY = 4;
        System.out.println(numberX / numberY); // seharusnya hasilnya 3.25, namun akan di bulatkan mejadi 3. karena tipe
                                               // datanya integer, bukan double

        // Cast
        int numberA = 13;
        int numberB = 4;
        System.out.println((double) numberA / numberB); // karena salah satu dirubah menjadi double, jadi hasilnya akan
                                                        // menjadi double. hasilnya 3.25
    }
}
