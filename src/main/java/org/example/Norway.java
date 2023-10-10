package org.example;

public class Norway extends TheGod{
    Norway(String ad, String ozellik, int yas) {
        super(ad, ozellik, yas);
    }

    @Override
    void tanriMesaji() {
        System.out.println("Ben Nordic Tanrısıyım: " + getAd() + ", Özellik: " + getOzellik());
    }
    void norwayGodPower() {
        System.out.println("Nordic Tanrısı gücü açığa çıkıyor...");
    }
}
