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
public class KullaniciMusteri extends Kullanici {
    
    String musteri_no;
    Enum odeme_yontemi;
    

    public String getMusteri_no() {
        return musteri_no;
    }

    public void setMusteri_no(String musteri_no) {
        
            if(musteri_no.length() == 6 && musteri_no.charAt(0) != '7' &&  musteri_no.charAt(0) != '8'  && musteri_no.charAt(0) != '9'){
            this.musteri_no = musteri_no;
            
        }
        else{
            System.out.println("Müşteri no 7,8 ve 9 ile  başlayamaz ve 6 haneli olmalıdır.");
        }
        
    }

    public Enum getOdeme_yontemi() {
        return odeme_yontemi;
    }

    public void setOdemeYontemi(Enum odeme_yontemi) {
        this.odeme_yontemi = odeme_yontemi;
    }

   /* public List getKullanicilar() {
        return Kullanicilar;
    }

    public void setKullanicilar(List Kullanicilar) {
        this.Kullanicilar = Kullanicilar;
    }
*/

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
    
    
    
 /*   @Override
    public String toString(){
        return adi + " " + soyadi + " " + sifre + " " + tcno + " " + telno + " " + email + " " + ikamet + " " + calisanId +   " " + ;
    }
    
*/    
}
