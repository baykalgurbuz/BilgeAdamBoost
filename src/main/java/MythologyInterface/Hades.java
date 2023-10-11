package MythologyInterface;

public class Hades extends  God implements ControlOfTheUnderworld{
    private boolean canControlUnderWorld;
    public Hades(String name, String origin,String specialPower,boolean canControlUnderWorld) {
        super(name, origin,specialPower);
        this.canControlUnderWorld=canControlUnderWorld;
    }

    @Override
    public void useDeadHuman() {
        System.out.println(getName() + " is using deadman!");
    }

    @Override
    public void dispalyInfo() {
        System.out.println("Hades: " + getName() + ", Origin: " + getOrigin() + "my special Power is "+getSpecialPower()+", Can Influence Underworld: " + canControlUnderWorld);
    }
}
