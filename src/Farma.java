import java.util.ArrayList;

public class Farma {
    private int zwierzeta;
    private String wlasciciel;
    ArrayList<Pracownik> prcownicyFirmy = new ArrayList<>();

    // Konstruktor z argumentami
    public Farma(int zwierzeta, ArrayList<Pracownik> prcownicyFirmy, String wlasciciel) {
        this.zwierzeta = zwierzeta;
        this.prcownicyFirmy = prcownicyFirmy;
        this.wlasciciel = wlasciciel;
        Wlasciciel.liczbafarm++; // Inkrementacja liczby farm
    }

    // Domyślny konstruktor, który również zwiększa liczbę farm
    public Farma() {
        Wlasciciel.liczbafarm++; // Inkrementacja liczby farm
    }

    public double policzPensje() {
        double koszt = 0;
        for (int i = 0; i < prcownicyFirmy.size(); i++) {
            koszt = koszt + prcownicyFirmy.get(i).getWyplata();
        }
        return koszt;
    }
}
