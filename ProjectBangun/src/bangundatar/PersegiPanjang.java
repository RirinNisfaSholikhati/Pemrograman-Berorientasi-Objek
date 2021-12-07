/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang extends BangunDatar {
    // atribut Persegi Panjang
    public double panjang;
    public double lebar;
     
    // method untuk hitung luas Persegi Panjang
    public double hitungLuas(){
        double luas = panjang * lebar;
        return luas;
    }
    
    // method untuk hitung keliling Persegi Panjang
    public double hitungKeliling(){
 	double keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
