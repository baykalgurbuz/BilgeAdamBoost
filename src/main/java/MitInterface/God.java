package MitInterface;

public class God extends MythologicalEntity implements Magical{
    God parent;
    God(String name, String mythology,God parent) {
        super(name, mythology);
        this.parent=parent;
    }

    @Override
    public void useMagic() {
        System.out.println(name + " uses divine magic.");
    }

    @Override
    void displayPower() {
        System.out.println(name + " is a powerful god in the " + mythology + " mythology.");
    }

    @Override
    void displaySpecialAbility() {
        System.out.println(name + " has the ability to shape reality in the " + mythology + " mythology.");
    }

    @Override
    public void displayFamilyTree() {
        if (parent!= null){
            System.out.println(name+" parent is "+parent.name+" in the " + parent.mythology + " mythology.");
            parent.displayFamilyTree();
        }

    }
}
