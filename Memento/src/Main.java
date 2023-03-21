import quiz.Quizzer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Quizzer quizzer = new Quizzer();
        Player[] pArr = new Player[5];
        Thread[] tArr = new Thread[5];

        for (int i = 0; i < 5; i++) {
            pArr[i] = new Player(quizzer);
            tArr[i] = new Thread(pArr[i]);
            tArr[i].start();
        }

        for (Thread t : tArr) {
            t.join();
        }
        System.out.println("All players finished!");

    }
}
