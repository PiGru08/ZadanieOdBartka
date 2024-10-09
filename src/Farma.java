import java.util.ArrayList;

public class Farma {
    private int zwierzeta;
    private String wlasciciel;
    ArrayList<Pracownik>prcownicyFirmy = new ArrayList<>();

    public Farma(int zwierzeta, ArrayList<Pracownik> prcownicyFirmy, String wlasciciel) {
        this.zwierzeta = zwierzeta;
        this.prcownicyFirmy = prcownicyFirmy;
        this.wlasciciel = wlasciciel;
    }
    public Farma(){
        Wlasciciel.liczbafarm++;
    }

    public double policzPensje(){
        double koszt = 0;
        for (int i = 0; i <prcownicyFirmy.size(); i++) {
        koszt = koszt+prcownicyFirmy.get(i).getWyplata();
        }
        return koszt;

    }
}
