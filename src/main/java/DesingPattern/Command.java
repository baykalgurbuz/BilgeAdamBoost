package DesingPattern;

public class Command {
    public void ac(){
        System.out.println("Televizyon acıldı");
    }
    public void kapat(){
        System.out.println("Televizyon kapatıldı");
    }
}
interface Komut{
    void execute();
}
class TelevizyonAcKomut implements Komut {
    private Command televizyon;

    public TelevizyonAcKomut(Command televizyon) {
        this.televizyon = televizyon;
    }

    @Override
    public void execute() {
        televizyon.ac();
    }
}
class TelevizyonKapatKomut implements Komut {
    private Command televizyon;

    public TelevizyonKapatKomut(Command televizyon) {
        this.televizyon = televizyon;
    }

    @Override
    public void execute() {
        televizyon.kapat();
    }
}
class UzaktanKumanda {
    private Komut acKomut;
    private Komut kapatKomut;

    public UzaktanKumanda(Komut acKomut, Komut kapatKomut) {
        this.acKomut = acKomut;
        this.kapatKomut = kapatKomut;
    }

    public void televizyonuAc() {
        acKomut.execute();
    }

    public void televizyonuKapat() {
        kapatKomut.execute();
    }
}