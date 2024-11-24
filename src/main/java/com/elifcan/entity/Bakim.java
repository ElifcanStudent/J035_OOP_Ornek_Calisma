package com.elifcan.entity;

import com.elifcan.utility.BakimTuru;

public class Bakim extends BaseEntity{

    private Arac arac;
    private BakimTuru bakimTuru;
    private String not;
    private String bakimaGirisTarihi;
    private String bakimaCikisTarihi;
    private double masraf;
    public boolean sigortaKapsami;
    private double tutar;

    public String toString() {
        return "Bakim{" +
                "arac=" + arac +
                ", bakimTuru=" + bakimTuru +
                ", not='" + not + '\'' +
                ", bakimaGirisTarihi='" + bakimaGirisTarihi + '\'' +
                ", bakimaCikisTarihi='" + bakimaCikisTarihi + '\'' +
                ", masraf=" + masraf +
                ", sigortaKapsami=" + sigortaKapsami +
                ", tutar=" + tutar +
                '}';
    }

    public Bakim() {
    }

    public Bakim(Arac arac,BakimTuru bakimTuru, String not, double masraf, boolean sigortaKapsami, double tutar) {
        this.arac = arac;
        this.bakimTuru = bakimTuru;
        this.not = not;
        this.masraf = masraf;
        this.sigortaKapsami = sigortaKapsami;
        this.tutar = tutar;
    }

    public String getBakimaGirisTarihi() {
        return bakimaGirisTarihi;
    }

    public void setBakimaGirisTarihi(String bakimaGirisTarihi) {
        this.bakimaGirisTarihi = bakimaGirisTarihi;
    }

    public String getBakimaCikisTarihi() {
        return bakimaCikisTarihi;
    }

    public void setBakimaCikisTarihi(String bakimaCikisTarihi) {
        this.bakimaCikisTarihi = bakimaCikisTarihi;
    }

    public BakimTuru getBakimTuru() {
        return bakimTuru;
    }

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public void setBakimTuru(BakimTuru bakimTuru) {
        this.bakimTuru = bakimTuru;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public double getMasraf() {
        return masraf;
    }

    public void setMasraf(double masraf) {
        this.masraf = masraf;
    }

    public boolean isSigortaKapsami() {
        return sigortaKapsami;
    }

    public void setSigortaKapsami(boolean sigortaKapsami) {
        this.sigortaKapsami = sigortaKapsami;
    }
}
