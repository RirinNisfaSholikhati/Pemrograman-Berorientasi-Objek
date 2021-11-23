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
public class DataMembership {
    private String IDmember, Nama, TypeMember;
    
    DataMembership(String IDmember, String Nama, String TypeMember){
        this.IDmember = IDmember;
        this.Nama = Nama;
        this.TypeMember = TypeMember;   
    }

    
    void print(){
        System.out.println("ID Member       : " + this.IDmember);
        System.out.println("Nama Member     : " + this.Nama);
        System.out.println("Type Member     : " + this.TypeMember);
    }

    
}
