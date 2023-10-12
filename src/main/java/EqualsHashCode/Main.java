package EqualsHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args )
    {
       // ornek1();
       // ornek2();
        ornek3();
    }

    private static void ornek3() {

        Person p1 = new Person(12345,"Enes","Baykal");
        Person p2 = new Person(12345,"Enes","Baykal");
        Person p3 = new Person(12345,"Beyza","Baykal");
        Map<Person, String> liste = new HashMap<>();
        liste.put(p1,"Enes");
        liste.put(p2,"Enes");
        liste.put(p3,"Beyza");
        System.out.println(liste.size());
    }

    private static void ornek2() {
        //hashcode kullanmadan yapılan ornek olarak dusun
        Person p1 = new Person(12345,"Enes","Baykal");
        Person p2 = new Person(12345,"Enes","Baykal");
        Person p3 = new Person(12343,"Beyza","Baykal");

        Map<Person, String> liste = new HashMap<>();
        liste.put(p1,"Enes");
        liste.put(p2,"Enes");
        liste.put(p3,"Beyza");

        System.out.println(liste.size());
    }

    private static void ornek1() {
        Person p1 = new Person(123,"Enes","Gurbuz");
        Person p2 = new Person(123,"Enes","Gurbuz");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
    }
}
