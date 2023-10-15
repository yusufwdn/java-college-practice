/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    public int nrp;
    public String nama;
    
    public Mahasiswa(int i, String n) {
        this.nrp = i;
        this.nama = n;
    }
    
    public int getNrp(){
        return this.nrp;
    }
    
    public String getNama(){
        return this.nama;
    }
}
