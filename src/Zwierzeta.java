import java.util.ArrayList;

public class Zwierzeta{
    private String imie;
    private int numer;
    private String gatunek;
    ArrayList<Zwierzeta> zwierzet = new ArrayList<>();

    public Zwierzeta(String imie, String gatunek, int numer) {
        this.imie = imie;
        this.gatunek = gatunek;
        this.numer = numer;
    }

    @Override
    public String toString() {
        return "Zwierzeta{" +
                "imie='" + imie + '\'' +
                ", numer=" + numer +
                ", gatunek='" + gatunek + '\'' +
                ", zwierzet=" + zwierzet +
                '}';
    }
}
