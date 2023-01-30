package jasperpkg;

public class Jasper {
    private Jeans jeans;
    private Shoes shoes;
    private Cap cap;
    private Shirt shirt;

    public Jasper(ClothingFactory clothingFactory) {
        jeans = clothingFactory.createJeans();
        shoes = clothingFactory.createShoes();
        cap = clothingFactory.createCap();
        shirt = clothingFactory.createShirt();
    }

    @Override
    public String toString() {
        String r = "I am wearing: ";
        r += jeans + " ";
        r += shoes + " ";
        r += cap + " ";
        r += shirt + " ";

        return r;

    }
}
