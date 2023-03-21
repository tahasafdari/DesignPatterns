package tyontekijat;

public class Tyontekija {
    private Esimies esimies;
    private double palkka;

    public Tyontekija(int palkka) {
        this.palkka = palkka;
    }

    public void setEsimies(Esimies esimies) {
        this.esimies = esimies;
    }

    public void kysyKorotusta(double prosentti) {
        if (this.esimies == null) {
            return;
        }
        System.out.println("Kysytään "+prosentti+" prosentin korotusta");
        if (this.esimies.kysyKorotusta(prosentti)) {
            this.palkka *= (1+(prosentti)/100);
            System.out.println("Korotus hyväksyttiin!");
            System.out.println("Palkka nyt: "+palkka+"\n");
        } else {
            System.out.println("Korotusta ei hyväksytty :(\n");
        }
    }
}
