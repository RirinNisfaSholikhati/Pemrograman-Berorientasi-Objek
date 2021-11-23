/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameproject;

/**
 *
 * @author ASUS
 */
public class GoldMember extends SilverMember {
    protected int cashback;
    
    protected void bonuscash(int cashback){
        int totalcashback = cashback * jmlHari;
        System.out.println("Jumlah Cashback     : Rp "+totalcashback);
    }
}
