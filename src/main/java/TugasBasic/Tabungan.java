/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBasic;

/**
 *
 * @author YUSUF
 */
public class Tabungan {
    public int saldo;
    
    public Tabungan(int initSaldo) {
        this.saldo = initSaldo;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
    public void simpanUang(int jumlah) {
        this.saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah) {
        if (this.saldo - jumlah > 0) {
            this.saldo -= jumlah;
            return true;
        }
        
        return false;
    }
}
