package com.elifcan.entity;

public class Marka extends BaseEntity{

    private final String ad;
    private final int yil;
    private String mensei;
    private final String kurucusu;

    public String toString() {
        return "Marka{" +
                "ad='" + ad + '\'' +
                ", yil=" + yil +
                ", mensei='" + mensei + '\'' +
                ", kurucusu='" + kurucusu + '\'' +
                '}';
    }

    public Marka(String ad, int yil, String kurucusu) {
        this.ad = ad;
        this.yil = yil;
        this.kurucusu = kurucusu;
    }

    public Marka(String ad, int yil, String mensei, String kurucusu) {
        this.ad = ad;
        this.yil = yil;
        this.mensei = mensei;
        this.kurucusu = kurucusu;
    }

    public String getKurucusu() {
        return kurucusu;
    }

    public String getMensei() {
        return mensei;
    }

    public void setMensei(String mensei) {
        this.mensei = mensei;
    }

    public int getYil() {
        return yil;
    }

    public String getAd() {
        return ad;
    }
}
