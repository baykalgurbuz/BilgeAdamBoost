package DesingPattern;

public class Singleton {
    //Bir classtan tek bir instance oluşturmak için kullanılan tasarım desenidir.
    //Constructor private olmalı
    //Class ile aynı türde static bir member olmalı
    //Static membera ulaşmak için static metod oluşturulmalı
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance=new Singleton();
        }
        return  instance;
    }
}
