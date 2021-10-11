/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author ASUS
 */
public class Ubin {
    int panjang; //panjang ubin
    int lebar; //lebar ubin
    
    int hitungLuas(){
        // menghitung luas ubin dengan memanfaatkan class persegi panjang
        PersegiPanjang x = new PersegiPanjang();
        return x.hitungLuas(this.panjang, this.lebar);
    }
}
