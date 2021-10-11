/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    void hitungluas(int r){
        double Luas = 3.14*r*r;
        System.out.println("Luas lingkaran dengan jari-jari "+r+ " adalah : " + Luas);
        System.out.println(" ");
    }
    
    void hitungluas(double r){
        double Luas = 3.14*r*r;
        System.out.println("Luas lingkaran dengan jari-jari "+r+ " adalah : " + Luas);
        System.out.println(" ");
    }
    
    void hitungkeliling(int r){
        double keliling = 2*3.14*r;
        System.out.println("Keliling lingkaran dengan jari-jari "+r+ " adalah : " + keliling);
        System.out.println(" ");
    }
    
    void hitungkeliling(double r){
        double keliling = 2*3.14*r;
        System.out.println("Keliling lingkaran dengan jari-jari "+r+ " adalah : " + keliling);
        System.out.println(" ");
    }
}
