package com.elifcan.entity;

import com.elifcan.utility.KiralamaSuresi;
import com.elifcan.utility.KiralamaTuru;

public class Kiralama extends BaseEntity{

    private Arac arac;
    private Firma firma;
    private KiralamaSuresi sure;
    private KiralamaTuru tur;
    private boolean sigorta;
    private boolean kasko;
    private String muayeneTarihi;
    private boolean depoDurumu;
    private int kmLimiti;
    private String teslimEdilecekAdres;
    private String teslimAlinacakAdres;
    private double fiyat;
    private double tutar;
    private String alisSaati;
    private String biraksiSaati;
    private Musteri musteri;

    @Override
    public String toString() {
        return "Kiralama{" +
                "arac=" + arac +
                "----------------" +
                ", firma=" + firma +
                "----------------" +
                ", sure=" + sure +
                ", tur=" + tur +
                ", sigorta=" + sigorta +
                ", kasko=" + kasko +
                ", muayeneTarihi='" + muayeneTarihi + '\'' +
                ", depoDurumu=" + depoDurumu +
                ", kmLimiti=" + kmLimiti +
                ", teslimEdilecekAdres='" + teslimEdilecekAdres + '\'' +
                ", teslimAlinacakAdres='" + teslimAlinacakAdres + '\'' +
                ", fiyat=" + fiyat +
                ", tutar=" + tutar +
                ", alisSaati='" + alisSaati + '\'' +
                ", biraksiSaati='" + biraksiSaati + '\'' +
                ", musteri=" + musteri +
                '}';
    }

    public Kiralama(String s, String string, String mail, String s1, boolean b, int i, int i1, int i2, KiralamaSuresi yillik, KiralamaTuru kurumsal, boolean b1, boolean b2, String string1, boolean b3, int i3, String ankara, String istanbul, int i4, int i5, String time, String time1, Musteri musteri) {
    }
// hangi arac // hangi firma
    public Kiralama(Arac arac, Firma firma, KiralamaSuresi sure, KiralamaTuru tur, boolean sigorta, boolean kasko, String muayeneTarihi,
                    boolean depoDurumu, int kmLimiti, String teslimEdilecekAdres, String teslimAlinacakAdres,
                    double fiyat, double tutar, String alisSaati, String biraksiSaati, Musteri musteri) {

        this.arac = arac;
        this.firma = firma;
        this.sure = sure;
        this.tur = tur;
        this.sigorta = sigorta;
        this.kasko = kasko;
        this.muayeneTarihi = muayeneTarihi;
        this.depoDurumu = depoDurumu;
        this.kmLimiti = kmLimiti;
        this.teslimEdilecekAdres = teslimEdilecekAdres;
        this.teslimAlinacakAdres = teslimAlinacakAdres;
        this.fiyat = fiyat;
        this.tutar = tutar;
        this.alisSaati = alisSaati;
        this.biraksiSaati = biraksiSaati;
        this.musteri = musteri;

    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public String getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(String alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getBiraksiSaati() {
        return biraksiSaati;
    }

    public void setBiraksiSaati(String biraksiSaati) {
        this.biraksiSaati = biraksiSaati;
    }

    public KiralamaSuresi getSure() {
        return sure;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public void setSure(KiralamaSuresi sure) {
        this.sure = sure;
    }

    public KiralamaTuru getTur() {
        return tur;
    }

    public void setTur(KiralamaTuru tur) {
        this.tur = tur;
    }

    public boolean isSigorta() {
        return sigorta;
    }

    public void setSigorta(boolean sigorta) {
        this.sigorta = sigorta;
    }

    public boolean isKasko() {
        return kasko;
    }

    public void setKasko(boolean kasko) {
        this.kasko = kasko;
    }

    public String getMuayeneTarihi() {
        return muayeneTarihi;
    }

    public void setMuayeneTarihi(String muayeneTarihi) {
        this.muayeneTarihi = muayeneTarihi;
    }

    public boolean isDepoDurumu() {
        return depoDurumu;
    }

    public void setDepoDurumu(boolean depoDurumu) {
        this.depoDurumu = depoDurumu;
    }

    public int getKmLimiti() {
        return kmLimiti;
    }

    public void setKmLimiti(int kmLimiti) {
        this.kmLimiti = kmLimiti;
    }

    public String getTeslimEdilecekAdres() {
        return teslimEdilecekAdres;
    }

    public void setTeslimEdilecekAdres(String teslimEdilecekAdres) {
        this.teslimEdilecekAdres = teslimEdilecekAdres;
    }

    public String getTeslimAlinacakAdres() {
        return teslimAlinacakAdres;
    }

    public void setTeslimAlinacakAdres(String teslimAlinacakAdres) {
        this.teslimAlinacakAdres = teslimAlinacakAdres;
    }
}
