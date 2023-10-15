/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author YUSUF
 */
public class Truk {
    public double muatan;
    public double muatanmaks;
    
    public Truk(double beratmaks){
        this.muatanmaks = beratmaks;
    }
    
    public double getMuatan(){
        return this.muatan;
    }
    
    public double getMuatanMaks(){
        return this.muatanmaks;
    }
    
    public void tambahMuatan(double berat){
        if(this.muatan + berat < this.muatanmaks) {
            this.muatan += berat;
        }
    }
}
