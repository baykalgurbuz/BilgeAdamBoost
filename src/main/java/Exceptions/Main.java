package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        //Error
        outOfMemoryError();
        stackOverFlowError();
        //RunTime Exception
        aritmeticException();
        nullPointerException();
        arrayIndexOutOfBoundsException();
        numberFormatException();
        //IO Exception
        iOException();
        interruptedException();
        fileNotFoundException();

        throwExample();
    }



    private static void fileNotFoundException() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("olmayanDosya.txt"));
            String satir = reader.readLine();
            System.out.println("Dosya İçeriği: " + satir);
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Dosya bulunamadı hatası: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

    private static void interruptedException() {
        Thread myThread = new Thread(() -> {
            try {
                Thread.sleep(5000); // Uyuma süresi
            } catch (InterruptedException e) {
                System.err.println("Kesilmiş istisnası: " + e.getMessage());
            }
        }); 
        myThread.start(); 
        myThread.interrupt();
    }

    private static void iOException() {
        try {
            // Dosyayı okuma işlemi
            BufferedReader reader = new BufferedReader(new FileReader("dosya.txt"));
            String satir = reader.readLine();
            System.out.println("Dosya İçeriği: " + satir);
            reader.close();
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

    private static void numberFormatException() {
        try {
            String str = "abc";
            int sayi = Integer.parseInt(str); // Hata: Geçersiz sayı formatı
        } catch (NumberFormatException e) {
            System.err.println("Sayı format hatası: " + e.getMessage());
        }
    }

    private static void arrayIndexOutOfBoundsException() {
        try {
            int[] dizi = {1, 2, 3};
            int eleman = dizi[5]; // Hata: Dizi indeksi sınırları dışında
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Dizi indeks hatası: " + e.getMessage());
        }
    }

    private static void nullPointerException() {
        try {
            String str = null;
            int uzunluk = str.length(); // Hata: null referansına erişim
        } catch (NullPointerException e) {
            System.err.println("Null referans hatası: " + e.getMessage());
        }
    }

    private static void aritmeticException() {
        try {
            int sonuc = 5 / 0; // Hata: Sıfıra bölme
        } catch (ArithmeticException e) {
            System.err.println("Aritmetik hata: " + e.getMessage());
        }
    }

    private static void stackOverFlowError() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.err.println("Stack bellek taşması hatası: " + e.getMessage());
        }
    }

    private static void outOfMemoryError() {
        try {
            int[] arr = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.err.println("Bellek tükenmesi hatası: " + e.getMessage());
        }
    }
    private static void recursiveMethod() {
        recursiveMethod();
    }
    private static void throwExample() {
        try {
            int sonuc = bolmeIslemi(10, 0);
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.err.println("Hata: " + e.getMessage());
        }
    }
    public static int bolmeIslemi(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            throw new ArithmeticException("Sıfıra bölme hatası");
        }
        return sayi1 / sayi2;
    }
}
