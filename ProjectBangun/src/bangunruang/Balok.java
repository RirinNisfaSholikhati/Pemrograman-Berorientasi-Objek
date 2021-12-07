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
public class Balok extends BangunRuang {
    // atribut Balok
    public double p, l, t;
    
    // method untuk hitung volume Balok
    public double hitungVolume(){
        double volume = p*l*t ;
        return volume;
    }
    
    // method untuk hitung luas permukaan Balok
    public double hitungLuasPermukaan(){
 	double luasP = 2*((p*l) + (p*t) + (l*t));
        return luasP;
    }
}
