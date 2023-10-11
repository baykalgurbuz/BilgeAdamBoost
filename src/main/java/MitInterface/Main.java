package MitInterface;

public class Main {
    public static void main(String[] args)
    {
        God uranus = new God("Uranus", "Greek", null);
        God kronos = new God("Kronos", "Greek", uranus);
        God zeus = new God("Zeus", "Greek", kronos);

        Titan atlas = new Titan("Atlas", "Greek");

        Hades hades = new Hades("Hades", zeus);

        System.out.println("--- Zeus Family Tree ---");
        zeus.displayFamilyTree();

        System.out.println("---");

        System.out.println("--- Atlas ---");
        atlas.displayPower();
        atlas.displaySpecialAbility();

        System.out.println("---");

        System.out.println("--- Hades ---");
        hades.displayPower();
        hades.displaySpecialAbility();
    }
}
