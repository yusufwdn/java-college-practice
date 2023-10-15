/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author YUSUF
 */
public class TestTugas1 {
    public static void main(String srt[]) {
        boolean status;

        // Penetapan saldo awal
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal :" + tabungan.getSaldo());

        // Simpan uang 3000
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");

        // Ambil uang 6000
        status = tabungan.ambilUang(6000);
        System.out.println("Jumlah uang yang diambil : 6000");

        // Cek status pengambilan uang
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");

        // Simpan uang 3500
        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan :3500");

        // Ambil uang 4000
        status = tabungan.ambilUang(4000);
        System.out.println("Jumlah uang yang diambil : 4000");

        // Cek status pengambilan uang
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");

        // Ambil uang 1600
        status = tabungan.ambilUang(1600);
        System.out.println("Jumlah uang yang diambil : 1600");

        // Cek status pengambilan uang
        if (status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");

        // Simpan uang 2000
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan :2000");

        // Cek saldo
        System.out.println("Saldo sekarang = " + tabungan.getSaldo());
    }
}
