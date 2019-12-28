/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nypodev;


/**
 *
 * @author DELL
 */
public class Tedarikci {
    
    String adi;
    String tedarikciID;
    int teslimatSuresi;

    
    public String getTedarikciID() {
        return tedarikciID;
    }

    public void setTedarikciID(String tedarikciID) {
        
        
        if(tedarikciID.length() == 6 && tedarikciID.charAt(0) == '7'){
            this.tedarikciID = tedarikciID;
            
            
        }
        else{
            System.out.println("Tedarikçi ID 7 ile başlamalıdır ve 6 haneli olmalıdır.");
        }
    }

 
    
    
    

}
