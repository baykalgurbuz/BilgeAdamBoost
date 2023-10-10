package org.example;

abstract class TheGod {
    String ad;
    String ozellik;
    int yas;

    TheGod(String ad, String ozellik, int yas) {
        this.ad = ad;
        this.ozellik = ozellik;
        this.yas = yas;
    }
    abstract void tanriMesaji();

    void tanriBilgileri() {
        System.out.println("Tanrı Adı: " + ad);
        System.out.println("Tanrı Özellikleri: " + ozellik);
        System.out.println("Tanrı Yaşı: " + yas);
    }
    void evreniYarat() {
        System.out.println("Evren yaratılıyor...");
    }
}
