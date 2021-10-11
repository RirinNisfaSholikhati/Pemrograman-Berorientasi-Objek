/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author ASUS
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi x = new Operasi();
        
        x.jumlahkan(3,4);
        x.jumlahkan(4,7,-9);
        x.jumlahkan(3.4,-0.002,0.12313);
        x.perkalian(2.4, 2);
        x.perkalian(2, 8);
        x.perkalian(24, 1, 3);
        x.perkalian(2.0, 3.3, 4.3);
    }
    
}
