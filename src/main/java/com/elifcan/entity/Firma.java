package com.elifcan.entity;

public class Firma extends BaseEntity{

    private String ad;
    private String sube;
    private String adres;
    private String telefon;
    private String email;
    private String personelAd;

    public String toString() {
        return "Firma{" +
                "ad='" + ad + '\'' +
                ", sube='" + sube + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", personelAd='" + personelAd + '\'' +
                '}';
    }

    public Firma() {
    }

    public Firma(String ad, String sube, String adres, String telefon, String email, String personelAd) {
        this.ad = ad;
        this.sube = sube;
        this.adres = adres;
        this.telefon = telefon;
        this.email = email;
        this.personelAd = personelAd;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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

    public String getPersonelAd() {
        return personelAd;
    }

    public void setPersonelAd(String personelAd) {
        this.personelAd = personelAd;
    }
}
