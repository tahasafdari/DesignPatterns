import quiz.Quizzer;

import java.util.Random;

public class Player implements Runnable {
    private Object obj;
    private Random rand;
    private Quizzer master;

    public Player() {
        rand = new Random();
    }

    public Player(Quizzer quizzer) {
        this.rand = new Random();
        this.master = quizzer;
    }

    public void setSecretNumber() {
        if (master == null)
            return;
        this.obj = master.joinTheGame();
        System.out.println(Thread.currentThread().getName() + " has joined the game");
    }

    public void setQuizzer(Quizzer quizzer) {
        this.master = quizzer;
    }

    public boolean quessedCorrectly() {
        int quess = rand.nextInt(10);
        System.out.println(Thread.currentThread().getName() + " guesses " + quess);
        return master.quess(this.obj, quess);
    }

    @Override
    public void run() {
        setSecretNumber();
        while (!quessedCorrectly()) {
            try {
                Thread.sleep(100 + rand.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("### " + Thread.currentThread().getName() + " guessed correctly ###");

    }
}
