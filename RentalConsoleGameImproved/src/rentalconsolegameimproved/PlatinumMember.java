/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimproved;

/**
 *
 * @author ASUS
 */
public class PlatinumMember extends GoldMember{
    private int pulsa;
    
    protected void bonuspulsa(int pulsa){
        int totalpulsa = pulsa*jmlHari;
        System.out.println("Bonus Pulsa         : Rp "+totalpulsa);
    }
}
