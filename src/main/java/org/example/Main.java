package org.example;

public class Main {
    public static void main(String[] args) {
        Grek zeus =new Grek("Zeus", "Gök gürültüsü tanrısı", 1000);
        zeus.evreniYarat();
        zeus.tanriMesaji();
        zeus.tanriBilgileri();
        Grek kronos =new Grek("Kronos", "Zaman tanrısı", 2000);
        kronos.tanriBilgileri();
        kronos.tanriMesaji();
        Norway odin = new Norway("Odin", "Bilgelik ve savaş tanrısı", 1500);
        Norway thor = new Norway("Thor", "Yıldırım,gökyüzünün ve tarım  tanrısı", 1000);
        odin.evreniYarat();
        odin.tanriMesaji();
        odin.tanriBilgileri();
        thor.evreniYarat();
        thor.tanriMesaji();
        thor.tanriBilgileri();
        Turkey semrukBurkut =new Turkey("Semruk Burkut","Oluleri taşıyan cift kanatlı kartal",12222);
        semrukBurkut.tanriBilgileri();
    }
}