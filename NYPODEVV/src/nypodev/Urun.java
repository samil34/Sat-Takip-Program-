/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nypodev;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Urun {
    
    String barkod_no;
    String adi;
    float fiyat;
    int stokMiktari;
    String tedarikciID;
    public static List<String> urunler = new ArrayList<String>();
    public static String k;

    public String getBarkod_no() {
        return barkod_no;
    }

    public void setBarkod_no(String barkod_no) {
        if(barkod_no.length() == 13 ){
            this.barkod_no = barkod_no;
            
        }
        else{
            System.out.println("Barkod No 13 haneli olmalıdır.");
        }
        this.barkod_no = barkod_no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public String getTedarikciID() {
        return tedarikciID;
    }

    public void setTedarikciID(String tedarikciID) {
        this.tedarikciID = tedarikciID;
    }
    
    
            
            
    
}
