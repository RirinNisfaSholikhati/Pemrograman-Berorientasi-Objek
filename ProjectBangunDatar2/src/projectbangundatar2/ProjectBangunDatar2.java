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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        
        pp.hitungluas(10, 5);
        pp.hitungluas(3.6,8);
        pp.hitungluas(6, 8.3);
        pp.hitungluas(5.6, 8.8);
        pp.hitungkeliling(10, 5);
        pp.hitungkeliling(3.6, 8);
        pp.hitungkeliling(6, 8.3);
        pp.hitungkeliling(5.6, 8.8);
        
        System.out.println("-------------------------------------------------------------------------");
        Persegi persegi = new Persegi();
        
        persegi.hitungluas(4.5);
        persegi.hitungkeliling(4.5);
        persegi.hitungluas(7);
        persegi.hitungkeliling(7);
        
        System.out.println("-------------------------------------------------------------------------");
        Lingkaran lingkaran = new Lingkaran();
        
        lingkaran.hitungluas(5);
        lingkaran.hitungkeliling(5);
        lingkaran.hitungluas(7.4);
        lingkaran.hitungkeliling(7.4);
        
        System.out.println("-------------------------------------------------------------------------");
        Segitiga segitiga = new Segitiga();
        
        segitiga.hitungluas(8, 10);
        segitiga.hitungkeliling(8, 10);
        segitiga.hitungluas(8, 11.5);
        segitiga.hitungkeliling(8, 11.5);
        segitiga.hitungluas(12.2, 9);
        segitiga.hitungkeliling(12.2, 9);
        segitiga.hitungluas(13.9, 20.7);
        segitiga.hitungkeliling(13.9, 20.7);
    }
    
}
