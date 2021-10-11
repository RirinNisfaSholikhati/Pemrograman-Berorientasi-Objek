/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    int r;
    
    double hitungluas(){
        Persegi ps = new Persegi();
        double set_lingkaran = 0.5*3.14*r*r;
        return set_lingkaran;
    }
}
