//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Pracownik pracownikAdam = new Pracownik("Adam", "Niedziela", "Opiekun Krów", 5500);
    Pracownik pracownikKlara = new Pracownik("Klara", "Nowa", "Obornik", 6500);
    Farma farma1 = new Farma();
    Zwierzeta krowa = new Zwierzeta("Adas", "Krowa", 1);
    Wlasciciel Adam = new Wlasciciel("Adam", "Niedziela");
        System.out.println(pracownikAdam);
        System.out.println(pracownikKlara);
        System.out.println(krowa);
        System.out.println(Adam);
    }
}