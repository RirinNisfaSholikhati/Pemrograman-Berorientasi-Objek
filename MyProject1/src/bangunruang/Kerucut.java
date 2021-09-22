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
public class Kerucut {
    //atribut
    public double T;
    public double s;
    public double r;
    
    //metbhod
    public void hitungVolume(){
        double volume = 3.14*r*r*T/3;
        System.out.println("Volume Kerucut: " + volume);
    }
    
    public void hitungLuasSelimut(){
        double luas_selimut = 3.14*r*s;
        System.out.println("Luas Selimut Kerucut: " + luas_selimut);
    }
}
