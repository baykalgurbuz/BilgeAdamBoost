package org.example;

public class Main {
    public static void main(String[] args) {
        Grek kosmos =new Grek("Kosmos", "Tüm mitoloji benden olustu.", 1000);
        kosmos.evreniYarat();
        kosmos.tanriMesaji();
        kosmos.tanriBilgileri();
        Gaia uranus =new Gaia("Uranus","Kozmik bir gücüm vardır uzayın ta kendisiyim",4000);
        uranus.whoAmI();
        uranus.tanriBilgileri();
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