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
public class Bola extends BangunRuang{
    // atribut Bola
    public double r;
    
    // method untuk hitung volume Bola
    public double hitungVolume(){
        double volume = 4/3 * Math.PI *r*r*r;
        return volume;
    }
    
    // method untuk hitung luas permukaan Bola
    public double hitungLuasPermukaan(){
 	double luasP = 4* Math.PI*r*r;
        return luasP;
    }
}
