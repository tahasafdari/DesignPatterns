public class Singleton extends AbstractFactory{
    private Singleton(){

    }
    private static Singleton INSTANCE = null;
    private static String juiceChoice = "";
    private Juice chocolate = null;
    private Juice Mango = null;

    public synchronized static Singleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void showMessage() {

        System.out.println("All Juice taste Yuuuummmmyyyyy!");
    }

    @Override
    public synchronized Juice create(String juiceChoice) {

        this.juiceChoice = juiceChoice;

        if (juiceChoice.equalsIgnoreCase("Chocolate")) {
            chocolate = new ChocolateJuice();
            return chocolate;
        }
        else if (juiceChoice.equalsIgnoreCase("Mango")) {
            Mango = new MangoJuice();
            return Mango;
        }
        return null;
    }
}
