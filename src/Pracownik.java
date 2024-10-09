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

    public ArrayList<Zwierzeta> getZwierzetanaFarmie() {
        return zwierzetanaFarmie;
    }

    public void setZwierzetanaFarmie(ArrayList<Zwierzeta> zwierzetanaFarmie) {
        this.zwierzetanaFarmie = zwierzetanaFarmie;
    }

    public void dodajZwierzeta(Zwierzeta zwierzeta) {
        zwierzetanaFarmie.add(zwierzeta);
    }
    public void zmienPrzydzial(Pracownik pracownik1,Pracownik pracownik2, Zwierzeta zwierzeDoZmiany){
        ArrayList<Zwierzeta> lista= pracownik1.getZwierzetanaFarmie();
        ArrayList<Zwierzeta> lista2= pracownik2.getZwierzetanaFarmie();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.contains(zwierzeDoZmiany)){
                Zwierzeta zwierzeDoDodania = lista.get(i);
                lista.remove(i);
                pracownik1.setZwierzetanaFarmie(lista);
                lista2.add(zwierzeDoDodania);
                pracownik2.setZwierzetanaFarmie(lista2);
                break;
            }
        }

    }
    @Override
    public String toString() {
        return "Pracownik{" +
                "stanowisko='" + stanowisko + '\'' +
                ", wyplata=" + wyplata +
                ", zwierzetanaFarmie=" + zwierzetanaFarmie +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }
}