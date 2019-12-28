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
public class Siparis {
    
    String siparis_no;
    String barkod_no;
    int urun_adedi;
    float ucret;
    
    String calisan_no; 

    public String getSiparis_no() {
        return siparis_no;
    }

    public void setSiparis_no(String siparis_no) {
        if(siparis_no.length() == 8 ){
            this.siparis_no = siparis_no;
            
        }
        else{
            System.out.println("Sipariş No 8 haneli olmalıdır.");
        }
        
    
        
    }

    public String getBarkod_no() {
        return barkod_no;
    }

    public void setBarkod_no(String barkod_no) {
        this.barkod_no = barkod_no;
    }

    public int getUrun_adedi() {
        return urun_adedi;
    }

    public void setUrun_adedi(int urun_adedi) {
        this.urun_adedi = urun_adedi;
    }

    public float getUcret() {
        return ucret;
    }

    public void setUcret(float ucret) {
        this.ucret = ucret;
    }

    public String getCalisan_no() {
        return calisan_no;
    }

    public void setCalisan_no(String calisan_no) {
        this.calisan_no = calisan_no;
    }
    
    
    
    
    
            
    
}
