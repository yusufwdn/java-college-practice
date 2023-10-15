/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public class Tabungan {
    public int saldo;
    
    public Tabungan(int i) {
        this.saldo = i;
    }
    
    public void ambilUang(int i) {
        this.saldo -= i;
    }
}
