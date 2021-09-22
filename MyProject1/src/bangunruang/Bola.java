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
public class Bola {
    //atribut
    public double r;
    
    //metbhod
    public void hitungVolume(){
        double volume = 4/3*3.14*r*r;
        System.out.println("Volume Bola: " + volume);
    }
    
    public void hitungLuasSelimut(){
        double luas_selimut = 4*3.14*r*r;
        System.out.println("Luas Selimut Bola: " + luas_selimut);
    }
}
