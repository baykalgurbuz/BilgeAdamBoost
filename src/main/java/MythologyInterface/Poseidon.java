package MythologyInterface;

public class Poseidon extends God implements ControlOfTheSea {
    private boolean canControlSeas;
    public Poseidon(String name, String origin,String specialPower,boolean canControlSeas) {
        super(name, origin,specialPower);
        this.canControlSeas=canControlSeas;
    }

    @Override
    public void useWater() {
        System.out.println(getName() + " is controlling the seas!");
    }

    @Override
    public void dispalyInfo() {
        System.out.println("Poseidon: " + getName() + ", Origin: " + getOrigin() +"my special power is "+getSpecialPower()+ ", Can Control Seas: " + canControlSeas);
    }
}
