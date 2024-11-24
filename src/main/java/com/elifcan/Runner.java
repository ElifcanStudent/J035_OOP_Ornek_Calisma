package com.elifcan;

import com.elifcan.entity.*;
import com.elifcan.repository.*;
import com.elifcan.utility.*;

public class Runner {
    public static void main(String[] args) {
        /**
         * Arac Kiralama Yonetim Sistemi
         * ----------------------------
         * --- Musteri
         * --- Arac(uuid, yili, plaka vs. marka ve mode)(Satis-SatisDetay gibi)
         * ------Marka ve Model ayrı birer entity olacaklar.
         * --- Kiralama
         * --- Firma (Kiralama Yapan Firma)
         * --- Bakim
         */

        Musteri musteri = new Musteri("MUSTAFA DENİZ","0534 658 4719","mustafa@gmail.com","254",
                true,2024,45);
        MusteriRepository musteriRepository = new MusteriRepository();
        musteriRepository.save(musteri);
        System.out.println(musteri.toString());

        System.out.println("----------------------------------------------------");

        Marka marka = new Marka("Volvo",1940,"Assar Gabrielsson and Gustav Larson");
        Model model = new Model("XC40",2020,"isvec tarzi","Sedan",5,420,
                5,false);



        Firma firma=new Firma("FORD OTOSAN","KIZILAY","ANKARA ","0542 8978 6354",
                "Fford@gmail.com","CANER YILDIZ");
        FirmaRepository firmaRepository = new FirmaRepository();
        firmaRepository.save(firma);
        System.out.println(firma.toString());
        System.out.println("----------------------------------------------------");

        Arac arac=new Arac(AracTuru.KARAVAN,2024,"06 BN 24", Yakit.BENZINLI,"MOTOR36",
                VitesTuru.OTOMATIK,marka,model, true);
        AracRepository aracRepository = new AracRepository();
        aracRepository.save(arac);
        System.out.println(arac.toString());
        System.out.println("----------------------------------------------------");

        Bakim bakim1 = new Bakim(arac,BakimTuru.LASTIK_BAKIM,"Arabanın sağ lastiği patlak",6000,true,8000);
        BakimRepository bakimRepository=new BakimRepository();
        bakimRepository.save(bakim1);
        System.out.println(bakim1.toString());
        System.out.println("----------------------------------------------------");

        Kiralama kiralama=new Kiralama(arac,firma,KiralamaSuresi.YILLIK, KiralamaTuru.KURUMSAL,true,true,"05.07.2025",
                true,1000,"Ankara","Istanbul",30_000,1_080_000,
                "18:00","20:00",musteri);
        KiralamaRepository kiralamaRepository = new KiralamaRepository();
        kiralamaRepository.save(kiralama);
        System.out.println(kiralama.toString());
        System.out.println("----------------------------------------------------");

        // şuan kirada olan araçlar hangileridir
        // adı ahmet olan müşteri hangi aracı kiraladı
        // müsait olan kirada olmayan arızada olmayan araçlar hangileridir
        // bugün hangi araçlar kiradan dönecek
        // bakim










    }
}