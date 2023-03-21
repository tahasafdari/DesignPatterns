package quiz;

import java.util.Random;

public class Quizzer {
    private Random rand;

    public Quizzer() {
        rand = new Random();
    }

    public synchronized Object joinTheGame() {
        return new Memento(rand.nextInt(10));
    }

    public synchronized boolean quess(Object obj, int quess) {
        Memento mem = (Memento) obj;
        if (mem.number == quess)
            return true;

        return false;
    }
}
