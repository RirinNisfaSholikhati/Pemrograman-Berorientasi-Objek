/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameproject;

import java.util.ArrayList;
/**
 *
 * @author ASUS
 */

public class Member {
    
    ArrayList<DataMembership> membership = new ArrayList<DataMembership>();
    
    void addMember(DataMembership data){
        this.membership.add(data);
    }
    
    void tampilMember(){
        for(DataMembership item: this.membership){
            item.print();
        }
    }
   
    
    

}
