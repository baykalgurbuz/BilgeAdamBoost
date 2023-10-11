package MitInterface;

public class Hades extends God{
    Hades(String name, God parent) {
        super(name, "Greek", parent);
    }
    @Override
    void displayPower() {
        System.out.println(name + " is the god of the underworld in the Greek mythology.");
    }

    @Override
    void displaySpecialAbility() {
        System.out.println(name + " has control over the dead in the Greek mythology.");
    }
}
