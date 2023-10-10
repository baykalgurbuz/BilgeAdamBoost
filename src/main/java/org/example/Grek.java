package org.example;

public class Grek extends TheGod{
    Grek(String ad, String ozellik, int yas) {
        super(ad, ozellik, yas);
    }

    @Override
    void tanriMesaji() {
        System.out.println("Ben Yunan Tanrısıyım: " + ad + ", Özellik: " + ozellik);
    }
    void grekGodRitual(){
        System.out.println("Yunan Tanrısı ritüeli yapılıyor...");
    }
}
