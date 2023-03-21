package tyontekijat;

public class YksikkoPaallikko extends Esimies {
    public YksikkoPaallikko(Esimies s) {
        super(s);
    }

    @Override
    public boolean kysyKorotusta(double prosentti) {
        if (prosentti < 5) {
            System.out.println("Yksikköpäällikko hyväksyi korotuksen.");
            return true;
        }
        System.out.println("Yksikköpäällikkö ei voi hyväksyä korotusta, viedään ylemmäs.");
        return super.kysyKorotusta(prosentti);
    }
}
