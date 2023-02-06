public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.create();
        String p = pc.getParts();
        System.out.println(p);
        int price = pc.price();
        System.out.println("Computer's full price is: " + price + "$");

    }
}