package org.example;

public class Turkey extends TheGod{
    Turkey(String ad, String ozellik, int yas) {
        super(ad, ozellik, yas);
    }

    @Override
    void tanriMesaji() {
        System.out.println("Ben Nordic Tanrısıyım: " + ad + ", Özellik: " + ozellik);
    }
}
