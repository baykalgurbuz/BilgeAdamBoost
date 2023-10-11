package MitInterface;

abstract class MythologicalEntity implements FamilyTree{
    String name ;
    String mythology;
    MythologicalEntity(String name,String mythology)
    {
        this.name=name;
        this.mythology=mythology;
    }
    abstract  void displayPower();
    abstract void displaySpecialAbility();
}
