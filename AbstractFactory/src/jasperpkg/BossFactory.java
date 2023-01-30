package jasperpkg;

public class BossFactory implements ClothingFactory {

    @Override
    public Jeans createJeans() {
        return new BossJeans();
    }

    @Override
    public Shirt createShirt() {
        return new BossTShirt();
    }

    @Override
    public Cap createCap() {
        return new BossCap();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }
}
