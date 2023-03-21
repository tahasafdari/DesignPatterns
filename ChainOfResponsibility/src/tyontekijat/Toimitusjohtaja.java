package tyontekijat;

public class Toimitusjohtaja extends Esimies {

    public Toimitusjohtaja(Esimies s) {
        super(s);
    }

    @Override
    public boolean kysyKorotusta(double prosentti) {
        if (prosentti > 20) {
            System.out.println("Ole realistinen.");
            return false;
        }
        System.out.println("Toimitusjohtaja hyväksyi korotuksen");
        return true;
    }
}
