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
public class Tabung extends BangunRuang {
    // atribut Tabung
    public double r;
    public double tinggi;
     
    // method untuk hitung volume Tabung
    public double hitungVolume(){
        double volume = Math.PI*r*r*tinggi ;
        return volume;
    }
    
    // method untuk hitung luas permukaan Tabung
    public double hitungLuasPermukaan(){
 	double luasP = 2 * Math.PI *r*(r+tinggi);
        return luasP;
    }
}
