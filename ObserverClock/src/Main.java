public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clockTimer);
        /*AnalogClock analogClock = new AnalogClock(clockTimer); */

        while(true){
            clockTimer.tick();
            Thread.sleep(1000);
        }

    }
}