/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author YUSUF
 */
public class MobilTest {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.name = "Avanza";
        mobil1.color = "Merah";
        mobil1.getIdentity();
        mobil1.getCurrentSpeed();
        mobil1.addSpeed(10);
        mobil1.addSpeed(20);
        mobil1.getCurrentSpeed();        
        mobil1.stop();
    }
}
