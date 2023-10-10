package org.example;

public class Gaia extends Grek{
    Gaia(String ad, String ozellik, int yas) {
        super(ad, ozellik, yas);
    }
    void whoAmI()
    {
       System.out.println("Ben Gaia'nın cocugu "+getAd());
    }
}
