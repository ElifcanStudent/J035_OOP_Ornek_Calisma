package com.elifcan.entity;

public class Model extends BaseEntity {

    private String ad;
    private int uretimYili;
    private String tasarim;
    private String kasaTipi;
    private int kapiSayisi;
    private int bagajHacmi;
    private int koltukSayisi;
    private boolean sunroof;

    public String toString() {
        return "Model{" +
                "ad='" + ad + '\'' +
                ", uretimYili=" + uretimYili +
                ", tasarim='" + tasarim + '\'' +
                ", kasaTipi='" + kasaTipi + '\'' +
                ", kapiSayisi=" + kapiSayisi +
                ", bagajHacmi=" + bagajHacmi +
                ", koltukSayisi=" + koltukSayisi +
                ", sunroof=" + sunroof +
                '}';
    }

    public Model() {
    }

    public Model(String ad, int uretimYili, String tasarim, String kasaTipi, int kapiSayisi, int bagajHacmi, int koltukSayisi, boolean sunroof) {
        this.ad = ad;
        this.uretimYili = uretimYili;
        this.tasarim = tasarim;
        this.kasaTipi = kasaTipi;
        this.kapiSayisi = kapiSayisi;
        this.bagajHacmi = bagajHacmi;
        this.koltukSayisi = koltukSayisi;
        this.sunroof = sunroof;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getTasarim() {
        return tasarim;
    }

    public void setTasarim(String tasarim) {
        this.tasarim = tasarim;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public int getBagajHacmi() {
        return bagajHacmi;
    }

    public void setBagajHacmi(int bagajHacmi) {
        this.bagajHacmi = bagajHacmi;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
}
