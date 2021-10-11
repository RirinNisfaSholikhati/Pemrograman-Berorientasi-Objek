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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Project 1
        System.out.println("===========================PROJECT 1=============================");
        Persegi X = new Persegi();
        X.s=42;
        System.out.println("Luas Persegi : " + X.hitungluas()+" cm2");
        
        Lingkaran Y = new Lingkaran();
        Y.r=21;
        double totalLuasLingkaran = 4 * Y.hitungluas();
        System.out.println("Luas 4 bangun setengah lingkaran: "+totalLuasLingkaran+" cm2");
             
        double TotalLuas = X.hitungluas()+totalLuasLingkaran;
        System.out.println("Total luas 1 buah bangun persegi dan bangun 4 setengah lingkaran : "+TotalLuas+" cm2");
        System.out.println(" ");
        
        //Project2
        System.out.println("===========================PROJECT 2=============================");
        Lingkaran B = new Lingkaran();
        B.r=28;
        System.out.println("Luas Setengah Lingkaran Besar : " + B.hitungluas()+" cm2");
        
        Lingkaran K = new Lingkaran();
        K.r=14;
        double totalLingkaranK = 2 * K.hitungluas();
        System.out.println("Luas 2 bangun setengah lingkaran : "+ totalLingkaranK+" cm2");
        
        double totalLuas = B.hitungluas()-K.hitungluas();
        System.out.println("Luas bangun berwarna abu-abu adalah : "+totalLuas+" cm2");
    }
    
}
