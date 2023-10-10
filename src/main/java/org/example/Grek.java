package org.example;

public class Grek extends TheGod{
    Grek(String ad, String ozellik, int yas) {
        super(ad, ozellik, yas);
    }

    @Override
    void tanriMesaji() {
        System.out.println("Ben Yunan Tanrısıyım: " + getAd() + ", Özellik: " + getOzellik());
    }
    void grekGodRitual(){
        System.out.println("Yunan Tanrısı ritüeli yapılıyor...");
    }
}
