package org.example;

abstract class TheGod {
    private String ad;
    private String ozellik;
    private int yas;
    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setOzellik(String ozellik) {
        this.ozellik = ozellik;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }



    public String getAd() {
        return ad;
    }

    public String getOzellik() {
        return ozellik;
    }

    public int getYas() {
        return yas;
    }

    TheGod(String ad, String ozellik, int yas) {
        this.ad = ad;
        this.ozellik = ozellik;
        this.yas = yas;
    }
    abstract void tanriMesaji();

    void tanriBilgileri() {
        System.out.println("Tanrı Adı: " + getAd());
        System.out.println("Tanrı Özellikleri: " + getOzellik());
        System.out.println("Tanrı Yaşı: " + getYas());
    }
    void evreniYarat() {
        System.out.println("Evren yaratılıyor...");
    }
}
