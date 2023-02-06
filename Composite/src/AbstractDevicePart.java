public abstract class AbstractDevicePart implements DevicePart {
    int price = 0;

    @Override
    public void addParts(DevicePart part) {
        throw new RuntimeException("Something went wrong!");
    }

    public int getPrice(){
        return price;
    }
}
