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
public class Lingkaran {
    //atribut
    public double phi;
    public double r;
    
    //method
    public void hitungLuas(){
        double hasil = phi*r*r;
        System.out.println("Luas Lingkaran: " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2*phi*r;
        System.out.println("Keliling Lingkaran: " + hasil);
    }
}
