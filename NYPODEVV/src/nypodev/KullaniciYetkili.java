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
public class KullaniciYetkili extends Kullanici{
    
    String calisan_no;
    Float maas;

    public String getCalisan_no() {
        return calisan_no;
    }

    public void setCalisan_no(String calisan_no) {
        if(calisan_no.length() == 6 && calisan_no.charAt(0) == '9'){
            this.calisan_no = calisan_no;
            
        }
        else{
            System.out.println("Çalışan no 9 ile başlamalıdır ve 6 haneli olmalıdır.");
        }
        
    }

    public Float getMaas() {
        return maas;
    }

    public void setMaas(Float maas) {
        this.maas = maas;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTCno() {
        return TCno;
    }

    public void setTCno(String TCno) {
        this.TCno = TCno;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
    
    
    
    
}
