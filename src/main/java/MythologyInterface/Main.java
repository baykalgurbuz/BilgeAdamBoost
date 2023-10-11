package MythologyInterface;

public class Main {
    public static void main(String[] args) {
        Zeus zeus = new Zeus("Zeus", "Greek Mythology", "Father of god and men",true);
        Poseidon poseidon = new Poseidon("Poseidon", "Greek Mythology", "Creator of the seas",true);
        Hades hades = new Hades("Hades", "Greek Mythology", "Man of the underworld ",true);
        Artemis artemis =new Artemis("Artemis","Grek","I'm a moon goddess",false);
        Apollon apolllon = new Apollon("Apollon","Grek","I'm a sun god",false);
        zeus.dispalyInfo();
        zeus.useSkySkil();
        artemis.dispalyInfo();
        artemis.useSkySkil();
        apolllon.dispalyInfo();
        apolllon.useSkySkil();
        poseidon.dispalyInfo();
        poseidon.useWater();
        hades.dispalyInfo();
        hades.useDeadHuman();
    }
}
