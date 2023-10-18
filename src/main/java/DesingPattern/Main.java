package DesingPattern;

public class Main {
    public static void main(String[] args)
    {
        //singleton();
        //singletonAlternative();
        // builder();
        command();
    }

    private static void command() {
        Command televizyon =new Command();
        Komut acKomut = new TelevizyonAcKomut(televizyon);
        Komut kapatKomut = new TelevizyonKapatKomut(televizyon);

        // Uygulama (Invoker) nesnesi
        UzaktanKumanda kumanda = new UzaktanKumanda(acKomut, kapatKomut);

        // İstemci, kumanda üzerinden televizyonu kontrol ediyor
        kumanda.televizyonuAc();
        kumanda.televizyonuKapat();
    }

    private static void builder() {
        Builder builder =new Builder.BuilderClass()
                .marka("Toyota")
                .model("Corolla")
                .renk("Mavi")
                .build();
        System.out.println("Marka :"+builder.getMarka());
        System.out.println("Renk :"+builder.getRenk());
        System.out.println("Model :"+builder.getModel());
    }

    private static void singletonAlternative() {
        SingletonAlternative singletonAlternative =SingletonAlternative.getInstance();
        SingletonAlternative singletonAlternative2 =SingletonAlternative.getInstance();
        System.out.println("singleton1 =>"+singletonAlternative);
        System.out.println("singleton2 =>"+singletonAlternative2);
        System.out.println(singletonAlternative==singletonAlternative2);
    }

    private static void singleton() {
        Singleton singletonExample1 = Singleton.getInstance();
        Singleton singletonExample2 = Singleton.getInstance();
        System.out.println("singleton1 =>"+singletonExample1);
        System.out.println("singleton2 =>"+singletonExample2);
        System.out.println(singletonExample1==singletonExample2);
    }
}
