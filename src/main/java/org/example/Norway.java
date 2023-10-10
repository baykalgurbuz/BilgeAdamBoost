package org.example;

public class Norway extends TheGod{
    Norway(String ad, String ozellik, int yas) {
        super(ad, ozellik, yas);
    }

    @Override
    void tanriMesaji() {
        System.out.println("Ben Nordic Tanrısıyım: " + ad + ", Özellik: " + ozellik);
    }
    void norwayGodPower() {
        System.out.println("Nordic Tanrısı gücü açığa çıkıyor...");
    }
}
