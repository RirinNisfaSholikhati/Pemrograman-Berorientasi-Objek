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
public class BangunRuangMain {
    public static void main(String[] args){
        Bola bola = new Bola();
        bola.r = 21;
        bola.hitungVolume();
        bola.hitungLuasSelimut();
        System.out.println("--------------------------");
        
        //Kerucut
        Kerucut kerucut = new Kerucut();
        kerucut.T = 14;
        kerucut.r = 21;
        kerucut.s = 12;
        kerucut.hitungVolume();
        kerucut.hitungLuasSelimut();
        System.out.println("--------------------------");
        
        //Tabung
        Tabung tabung = new Tabung();
        tabung.T = 28;
        tabung.r = 30;
        tabung.hitungVolume();
        tabung.hitungLuasSelimut();
    }
}
