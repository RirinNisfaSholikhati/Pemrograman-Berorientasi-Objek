/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author ASUS
 */
public class Myclass {
    public static void main(String[] args){
    OperasiBilangan op1 = new OperasiBilangan();
        op1.bilPertama = 10;
        op1.bilKedua = 20;
        op1.hitungPenjumlahan();
        op1.hitungPengurangan();
        System.out.println("----------------------");
    OperasiBilangan op2 = new OperasiBilangan();
        op2.bilPertama = 25;
        op2.bilKedua = 55;
        op2.hitungPenjumlahan();
        op2.hitungPengurangan();
        System.out.println("----------------------");
    OperasiBilangan op3 = new OperasiBilangan();
        op3.bilPertama = 50;
        op3.bilKedua = 60;
        op3.hitungPenjumlahan();
        op3.hitungPengurangan();
        System.out.println("----------------------");
    OperasiBilangan op4 = new OperasiBilangan();
        op4.bilPertama = 100;
        op4.bilKedua = 150;
        op4.hitungPenjumlahan();
        op4.hitungPengurangan();
        op4.hitungPerkalian();
        op4.hitungPembagiannya();
    }
}
