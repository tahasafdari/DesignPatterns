public class Main {
    public static void main(String[] args) {
        Singleton chocolateJuice = Singleton.getInstance();
        Singleton mangoJuice = Singleton.getInstance();

        chocolateJuice.create("Chocolate");
        mangoJuice.create("Mango");

        chocolateJuice.showMessage();
        mangoJuice.showMessage();
    }
}