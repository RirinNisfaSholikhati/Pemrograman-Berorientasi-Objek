/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 25;
        pp1.lebar = 38;
        pp1.hitungLuas();
        pp1.hitungKeliling();
        System.out.println("--------------------------");
        
        //Persegi A
        Persegi op = new Persegi();
        op.sisi = 10;
        op.hitungLuas();
        op.hitungKeliling();
        System.out.println();
        
        //Persegi B
        Persegi op1 = new Persegi();
        op1.sisi = 15;
        op1.hitungLuas();
        op.hitungKeliling();
        System.out.println("--------------------------");
        
        //Lingkaran X
        Lingkaran lingkaranX = new Lingkaran();
        lingkaranX.phi = 22/7;
        lingkaranX.r = 25;
        lingkaranX.hitungLuas();
        lingkaranX.hitungKeliling();
        System.out.println();
        
        //Lingkaran Y
        Lingkaran lingkaranY = new Lingkaran();
        lingkaranY.phi = 22/7;
        lingkaranY.r = 37;
        lingkaranY.hitungLuas();
        lingkaranY.hitungKeliling();
    }
}
