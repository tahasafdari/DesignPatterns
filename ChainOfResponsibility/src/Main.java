import tyontekijat.*;

public class Main {

    public static void main(String args[]) {
        Esimies toimari = new Toimitusjohtaja(null);
        Esimies ykksikkoP = new YksikkoPaallikko(toimari);
        Esimies lahiE = new LahiEsimies(ykksikkoP);

        Tyontekija janne = new Tyontekija(1500);
        janne.setEsimies(lahiE);

        janne.kysyKorotusta(1.6);
        janne.kysyKorotusta(4);
        janne.kysyKorotusta(8.2);
        janne.kysyKorotusta(40);

    }
}
