package Reflection;

import EqualsHashCode.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class Main {
    public static void main(String[] args)
    {
      //  ornek1();
      //  ornek2();
        try
        {
            // ornek1();
            reflectionPerson();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private static void reflectionPerson() throws Exception {
        Class<ReflectionPerson> cls = ReflectionPerson.class;//Person sınıfının Class nesnesini alır ve cls değişkenine atar.
        Constructor<?> cstr = cls.getDeclaredConstructors()[0];//cls üzerindeki tanımlanmış olan tüm constructor'ları alır ve ilk constructor'ı seçer, bu constructor'ı cstr değişkenine atar.
        Object p = cstr.newInstance();//Person olusturulur
        // cls.getMethods() yazılabilirdi
        Method[] metods = p.getClass().getDeclaredMethods();
        for (Method method : metods)
        {
            if (method.getName().equals("setName"))
            {
                // method.getParameterTypes()
                method.invoke(p,"enes");
            }
        }
        for (Method method : metods)
        {
            if (method.getName().equals("getName"))
            {
                Object result = method.invoke(p);
                System.err.println(result);
            }
        }
    }

    private static void ornek2() {
        Sample sampleObject =new Sample();
        try {
            Field privateField =Sample.class.getDeclaredField("privateField");
            privateField.setAccessible(true);
            int privateFieldValue = (int)privateField.get(sampleObject);
            System.out.println("Private Alnının değeri :"+privateFieldValue);
        }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            e.printStackTrace();
        }

    }

    private static void ornek1() {
        Class<?> myClass = Sample.class;
        System.out.println("Sınıf adı :"+myClass.getName());
        System.out.println("\n Sınıf alanları :");
        Field[] fields =myClass.getDeclaredFields();
        for (Field field:fields)
        {
            System.out.println(field.getName());
        }
        System.out.println("\n Sınıf metodları :");
        Method[] methods =myClass.getDeclaredMethods();
        for (Method method:methods)
        {
            System.out.println(method.getName());
        }
    }
}
