package MythologyInterface;

public class Zeus extends  God implements ControlOfTheSky {
    private boolean canThrowLightning;
    public Zeus(String name, String origin,String specialPower,boolean canThrowLighting) {
        super(name, origin,specialPower);
        this.canThrowLightning=canThrowLighting;
    }
    @Override
    public void useSkySkil() {
        System.out.println(getName() + " is using THUNDERSSSSSSSSSS!");
    }

    @Override
    public void dispalyInfo() {
        System.out.println("Zeus: " + getName() + ", Origin: " + getOrigin() +"my special power is"+getSpecialPower()+ ", Can Throw Lightning: " + canThrowLightning);
    }
}
