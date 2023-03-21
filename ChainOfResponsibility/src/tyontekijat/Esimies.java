package tyontekijat;

public abstract class Esimies {
    private Esimies seuraava;

    public Esimies(Esimies s) {
        seuraava = s;
    }

    public boolean kysyKorotusta(double prosentti) {
        if (seuraava != null) {
            return seuraava.kysyKorotusta(prosentti);
        }
        return false;
    }
}
