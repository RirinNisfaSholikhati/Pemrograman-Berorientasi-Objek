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
public class PersegiPanjang {
    //atribut
    public int panjang;
    public int lebar;
    
    //method
    public void hitungLuas(){
        int Luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang: " + Luas);
    }
    public void hitungKeliling(){
        int Kel = 2*(panjang + lebar);
        System.out.println("Keliling Persegi panjang: " + Kel);
    }
}
