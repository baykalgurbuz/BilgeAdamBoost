package MythologyInterface;

public class Artemis extends Zeus{
    public Artemis(String name, String origin, String specialPower, boolean canThrowLighting) {
        super(name, origin, specialPower, canThrowLighting);
    }
    @Override
    public void dispalyInfo() {
        System.out.println(   getName() + ", Origin: " + getOrigin() +"my special power is"+getSpecialPower());
    }
    @Override
    public void useSkySkil(){
        System.out.println(getName() + " is a moon goddess");
    }
}
