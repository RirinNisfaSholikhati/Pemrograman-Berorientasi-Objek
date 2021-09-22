/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Tabung {
    //atribut
    public int T;
    public double r;
    
    //metbhod
    public void hitungVolume(){
        double volume = 3.14*r*r*T;
        System.out.println("Volume Tabung: " + volume);
    }
    
    public void hitungLuasSelimut(){
        double luas_selimut = 2*3.14*r*T;
        System.out.println("Luas Selimut Tabung: " + luas_selimut);
    }
}
