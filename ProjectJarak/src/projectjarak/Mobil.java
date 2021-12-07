/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjarak;

/**
 *
 * @author ASUS
 */
public abstract class Mobil {
    public abstract double hitungBahanbakar();
    public abstract double hitungWaktu();
    public void tampilkan(){
        System.out.println("Jumlah Minimal Bahan Bakar : " +this.hitungBahanbakar()+" liter");
        System.out.println("Waktu Perjalanan : " + this.hitungWaktu()+ " /jam");
    }
}
