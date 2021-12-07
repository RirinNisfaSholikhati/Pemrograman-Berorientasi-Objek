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
public class MobilSUV extends Mobil{
    //atribut
    public double jarak, kec;
    
    //method untuk menghitung min bahan bakar
    public double hitungBahanbakar(){
        double jumlah = jarak /12;
        return jumlah;
    }
    
    //method untuk mengitung waktu perjalanan
    public double hitungWaktu(){
        double waktu = jarak / kec;
        return waktu;
    }
}
