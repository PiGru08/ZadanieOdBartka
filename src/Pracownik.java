import java.util.ArrayList;

public class Pracownik extends Osoba {
    private String stanowisko;
    private double wyplata;
    ArrayList<Zwierzeta>zwierzetanaFarmie = new ArrayList<>();

    public Pracownik(String imie, String nazwisko, String stanowisko, double wyplata) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;;
        this.wyplata = wyplata;
    }

    public double getWyplata() {
        return wyplata;
    }
    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void dodajZwierzeta(Zwierzeta zwierzeta) {
        zwierzetanaFarmie.add(zwierzeta);
    }
}
