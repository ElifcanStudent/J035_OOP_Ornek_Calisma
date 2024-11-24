package com.elifcan.entity;

public class Musteri extends BaseEntity{
    
    private String ad;
    private String telefon;
    private String email;
    private String tcNo_vergiNo;
    private boolean ehliyetDurumu;
    private int ehliyetYili;
    private int yas;

    public String toString() {
        return "Musteri{" +
                "ad='" + ad + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", tcNo_vergiNo='" + tcNo_vergiNo + '\'' +
                ", ehliyetDurumu=" + ehliyetDurumu +
                ", ehliyetYili=" + ehliyetYili +
                ", yas=" + yas +
                '}';
    }

    public Musteri() {
    }

    public Musteri(String ad, String telefon, String email, String tcNo_vergiNo, boolean ehliyetDurumu, int ehliyetYili, int yas) {
        this.ad = ad;
        this.telefon = telefon;
        this.email = email;
        this.tcNo_vergiNo = tcNo_vergiNo;
        this.ehliyetDurumu = ehliyetDurumu;
        this.ehliyetYili = ehliyetYili;
        this.yas = yas;
    }

    public boolean isEhliyetDurumu() {
        return ehliyetDurumu;
    }

    public void setEhliyetDurumu(boolean ehliyetDurumu) {
        this.ehliyetDurumu = ehliyetDurumu;
    }

    public int getEhliyetYili() {
        return ehliyetYili;
    }

    public void setEhliyetYili(int ehliyetYili) {
        this.ehliyetYili = ehliyetYili;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTcNo_vergiNo() {
        return tcNo_vergiNo;
    }

    public void setTcNo_vergiNo(String tcNo_vergiNo) {
        this.tcNo_vergiNo = tcNo_vergiNo;
    }
}
