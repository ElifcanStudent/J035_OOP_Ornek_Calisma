package com.elifcan.entity;

import com.elifcan.utility.AracTuru;
import com.elifcan.utility.VitesTuru;
import com.elifcan.utility.Yakit;

public class Arac extends BaseEntity{

    private AracTuru aracTuru;
    private int yili;
    private String plaka;
    private Yakit yakit;
    private String motor;
    private VitesTuru vitesTur;
    private Marka marka;
    private Model model;
    private boolean bakimdaMi;

    @Override
    public String toString() {
        return "Arac{" +
                "aracTuru=" + aracTuru +
                ", yili=" + yili +
                ", plaka='" + plaka + '\'' +
                ", yakit=" + yakit +
                ", motor='" + motor + '\'' +
                ", vitesTur=" + vitesTur +
                ", marka=" + marka +
                ", model=" + model +
                ", bakimdaMi=" + bakimdaMi +
                '}';


    }

    public Arac() {
    }

//    public String getBakimdaMi(bakimdaMi)
//    {
//
//
//    }


    public Arac(AracTuru aracTuru, int yili, String plaka, Yakit yakit, String motor, VitesTuru vitesTur,
                Marka marka, Model model,boolean bakimdaMi) {
        this.bakimdaMi = bakimdaMi;
        this.aracTuru = aracTuru;
        this.yili = yili;
        this.plaka = plaka;
        this.yakit = yakit;
        this.motor = motor;
        this.vitesTur = vitesTur;
        this.marka = marka;
        this.model = model;

    }

    public AracTuru getAracTuru() {
        return aracTuru;
    }

    public void setAracTuru(AracTuru aracTuru) {
        this.aracTuru = aracTuru;
    }

    public int getYili() {
        return yili;
    }

    public void setYili(int yili) {
        this.yili = yili;
    }

    public boolean isBakimdaMi() {
        return bakimdaMi;
    }

    public void setBakimdaMi(boolean bakimdaMi) {
        this.bakimdaMi = bakimdaMi;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public Yakit getYakit() {
        return yakit;
    }

    public void setYakit(Yakit yakit) {
        this.yakit = yakit;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public VitesTuru getVitesTur() {
        return vitesTur;
    }

    public void setVitesTur(VitesTuru vitesTur) {
        this.vitesTur = vitesTur;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }







}
