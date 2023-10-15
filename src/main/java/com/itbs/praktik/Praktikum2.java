/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itbs.praktik;

/**
 *
 * @author YUSUF
 */
public class Praktikum2 {
    public static void main(String[] args) {
        // Tipe data boolean, hanya dapat berisikan true dan false saja
        boolean bool = true;

        // Mencetak boolean
        System.out.println(bool); // true
        System.out.println(true); // true
        System.out.println(false); // false

        // Operator perbandingan (== dan !=)
        System.out.println(6 + 2 == 5); // false
        System.out.println(6 + 2 != 5); // true

        // Operator perbandingan (<, <=, >. >=)
        System.out.println(4 + 2 > 6); // true
        System.out.println(4 + 2 >= 6); // false
        System.out.println(8 / 4 < 2); // false
        System.out.println(8 / 4 <= 2); // true

        // Operator logika - Dan (&&)
        // Operator "dan (&&)" akan bernilai true apabila seluruh perbandingannya
        // bernilai true
        int x;

        x = 5; // ketika x bernilai 5
        System.out.println(x > 10 && x < 30); // hasilnya false

        x = 20; // ketika x bernilai 20
        System.out.println(x > 10 && x < 30); // hasilnya true

        x = 35; // ketika x bernilai 35
        System.out.println(x > 10 && x < 30); // hasilnya false

        // Operator logika - Atau (||)
        // Operator "or (||)" akan bernilai true apabila salah satu dari perbandingannya
        // bernilai true
        x = 5; // ketika x bernilai 5
        System.out.println(x < 10 || x > 30); // hasilnya true

        x = 20; // ketika x bernilai 20
        System.out.println(x < 10 || x > 30); // hasilnya false

        x = 35; // ketika x bernilai 35
        System.out.println(x < 10 || x > 30); // hasilnya true

        // Operator logika - Bukan (!)
        // Operator "bukan/not (!)" akan bernilai true apabila nilai perbandingannya
        // adalah kebalikannya
        x = 20;
        System.out.println(x >= 30); // hasilnya false, karena nilai dari x tidak lebih besar atau sama dengan 30
        System.out.println(!(x >= 30)); // hasilnya true, karena nilai dari x tidak lebih besar dari 30

        int number = 10;

        // Statement IF
        if (number == 10) {
            System.out.println("number sama dengan 10");
        }

        // Block
        number = 20;
        if (number < 30) {
            System.out.println("Kondisinya bernilai true");
            System.out.println("number lebih kecil dari 30");
        }

        // Else
        number = 40;
        if (number < 30) {
            System.out.println("number lebih kecil dari 30");
        } else {
            System.out.println("number lebih besar atau sama dengan 30");
        }

        // Else if
        number = 25;
        if (number >= 30) { // false
            System.out.println("number lebih besar atau sama dengan 30");
        } else if (x > 20) { // true
            System.out.println("number lebih besar dari 20 tapi lebih kecil dari 30");
        } else {
            System.out.println("number lebih kecil dari atau sama dengan 20");
        }

        // Switch
        number = 8;
        switch (x % 2) {
            case 0:
                System.out.println("bilangan genap");
                break; // jika pada akhir case tidak ada break, maka kondisi selanjutnya akan berjalan
            case 1:
                System.out.println("bilangan ganjil");
                break;
        }

        // Default
        int rank = 5;
        switch (rank) {
            case 1:
                System.out.println("Medali emas");
                break;
            case 2:
                System.out.println("Medali perak");
                break;
            case 3:
                System.out.println("Medal perunggu");
                break;
            default: // jika tidak ada yang memenuhi kondisi pada case diatas, maka nilai pada
                     // default akan menjadi nilai balikannya
                System.out.println("Nice try, coba lagi ya lain kali.");
                break;
        }

        // Loop - While
        int i = 5; // inisiasi variabel
        while (i <= 5) { // pemeriksaan kondisi
            System.out.println(i); // iterasi kode
            i++; // perbarui variabel dengan penambahan 1
        }

        // Loop infinite
        // i = 5;
        // while (i <= 5) {
        // System.out.println(i);
        // // i++; // karena variabel tidak diperbarui, maka nilai i tidak akan memenuhi
        // kondisi while. terjadilah infinite loop
        // }

        // Loop - For
        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }

        // Statement Break pada Loop
        for (int j = 1; j <= 10; j++) {
            if (i > 5) { // jika variabel j bernilai lebih dari 5, maka jalankan 'break', yang berarti
                         // loop akan dianggap selesai dan tidak akan dilanjutkan
                break;
            }

            System.out.println(j);
        }

        // Statement Continue pada Loop
        for (int j = 1; j <= 10; j++) {
            if (i % 3 == 0) { // jika nilai pada i dapat habis dibagi 3, maka akan di skip ke proses loop
                              // selanjutnya
                break;
            }

            System.out.println(j);
        }

        // Tipe data Array
        // Membuat Array
        String[] names = { "John", "Kate", "Bobs" };
        System.out.println("Nama saya adalah " + names[0]); // Mengambil nilai pada array names dengan posisi awal (0)

        // Memperbarui element array
        names[0] = "James"; // Memperbarui nilai pada index 0
        System.out.println("");

        // Ketika element tidak ada akan menghasilkan error
        // names[3] = "Julia";

        // Array Loops
        for (int j = 0; j < names.length; j++) { // names.length akan mengembalikan total data yang ada di dalam array
            System.out.println("Halo " + names[j]);
        }

        // Enhanced Loops
        for (String myName : names) {
            System.out.println(myName);
        }

        // Proyek Akhir
        int[] numbers = { 1, 4, 6, 9, 13, 16 };
        int totalGenap = 0;
        int totalGanjil = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                totalGenap += num;
                System.out.println(num + " adalah bilangan genap");
            } else {
                totalGanjil += num;
                System.out.println(num + " adalah bilangan ganjil");
            }
        }

        System.out.println("Jumlah bilangan ganjil: " + totalGanjil);
        System.out.println("Jumlah bilangan genap: " + totalGenap);
    }
}
