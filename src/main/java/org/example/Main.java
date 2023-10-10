package org.example;

public class Main {
    public static void main(String[] args) {
        Grek gaia =new Grek("Gaia", "Toprak ana benim ve benim merhametim sizi yaşatacak.", 1000);
        gaia.evreniYarat();
        gaia.tanriMesaji();
        gaia.tanriBilgileri();
        Titans kronos =new Titans("Kronos ","Kozmik bir gücüm vardır ve zaman tanrısıyımdır ",4000);
        kronos.whoAmI();
        kronos.tanriBilgileri();
        kronos.whoAmI();
        Norway odin = new Norway("Odin", "Bilgelik ve savaş tanrısı", 1500);
        Norway thor = new Norway("Thor", "Yıldırım,gökyüzünün ve tarım  tanrısı", 1000);
        odin.evreniYarat();
        odin.tanriMesaji();
        odin.tanriBilgileri();
        thor.evreniYarat();
        thor.tanriMesaji();
        thor.tanriBilgileri();
        Turkey semruk =new Turkey("Semruk Burkut","Oluleri taşıyan cift kanatlı kartal",12222);
        semruk.tanriBilgileri();
    }
}