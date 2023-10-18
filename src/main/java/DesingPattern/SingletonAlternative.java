package DesingPattern;

public class SingletonAlternative {
    public static  SingletonAlternative instance = new SingletonAlternative();
    private SingletonAlternative(){};
    public static SingletonAlternative getInstance()
    {
        return  instance;
    }

}
