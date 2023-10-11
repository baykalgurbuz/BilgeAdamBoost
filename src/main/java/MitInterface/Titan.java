package MitInterface;

public class Titan extends MythologicalEntity{
    Titan(String name, String mythology) {
        super(name, mythology);
    }

    @Override
    public void displayFamilyTree() {

    }

    void displayPower() {
        System.out.println(name + " is a mighty Titan in the " + mythology + " mythology.");
    }

    void displaySpecialAbility() {
        System.out.println(name + " possesses immense strength in the " + mythology + " mythology.");
    }
}
