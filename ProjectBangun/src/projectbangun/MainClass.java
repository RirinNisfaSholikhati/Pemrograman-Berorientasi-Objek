/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang persegiPjg = new PersegiPanjang();
        
        //Persegi
        persegi.sisi = 5;
        System.out.println("\nPersegi dengan sisi = " + persegi.sisi);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.tampilHasil();
        
        //Lingkaran
        lingkaran.jari_jari = 27;
        System.out.println("\nPersegi dengan sisi = " + lingkaran.jari_jari);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.tampilHasil();
        
        //Persegi Panjang
        persegiPjg.panjang = 20;
        persegiPjg.lebar = 5;
        System.out.println("\nPersegi Panjang dengan panjang = "+ persegiPjg.panjang +" dan lebar = " + persegiPjg.lebar);
        persegiPjg.hitungLuas();
        persegiPjg.hitungKeliling();
        persegiPjg.tampilHasil();
        
        System.out.println("==============================================================================================");
        
        Tabung tabung = new Tabung();
        Balok balok = new Balok();
        Bola bola = new Bola();
        
        //Tabung
        tabung.r = 14;
        tabung.tinggi = 20;
        System.out.println("\nTabung dengan jari-jari = "+ tabung.r +" dan tinggi = " + tabung.tinggi);
        tabung.hitungVolume();
        tabung.hitungLuasPermukaan();
        tabung.tampilkan();
        
        //Balok
        balok.p = 30;
        balok.l = 15;
        balok.t = 20;
        System.out.println("\nBalok dengan panjang = "+ balok.p + ", lebar = " + balok.l + " dan tinggi = " + balok.t);
        balok.hitungVolume();
        balok.hitungLuasPermukaan();
        balok.tampilkan();
        
        //Bola
        bola.r = 38;
        System.out.println("\nBola dengan jari-jari = " + bola.r );
        bola.hitungVolume();
        bola.hitungLuasPermukaan();
        bola.tampilkan();
    }   
}
