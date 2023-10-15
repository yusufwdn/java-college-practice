/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author YUSUF
 */
public class TestTugas2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "Minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pick up", 1500, 2);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
        Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5);
        
        System.out.println("Info mobil1: ");
        mobil1.infoMobil();
        
        System.out.println("Info mobil2: ");
        mobil2.infoMobil();
        
        System.out.println("Info mobil3: ");
        mobil3.infoMobil();
        
        System.out.println("Info mobil4: ");
        mobil4.infoMobil();
    }
}
