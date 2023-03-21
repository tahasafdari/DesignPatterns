package tyontekijat;

public class LahiEsimies extends Esimies {

    public LahiEsimies(Esimies s) {
        super(s);
    }

    @Override
    public boolean kysyKorotusta(double prosentti) {
        if (prosentti <= 2) {
            System.out.println("Lähiesimies voi hyväksyä korotuksen.");
            return true;
        }
        System.out.println("Lähiesimies ei voi hyväksyä korotusta, viedään ylemmäs.");
        return super.kysyKorotusta(prosentti);
    }
}
