package jasperpkg;

public class AdidasFactory implements ClothingFactory {
    @Override
    public Jeans createJeans() {
        return new AdidasJeans();
    }

    @Override
    public Shirt createShirt() {
        return new AdidasTShirt();
    }

    @Override
    public Cap createCap() {
        return new AdidasCap();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}
