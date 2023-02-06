import java.util.Observer;
import java.util.Observable;

public class AnalogClock implements Observer {
    private ClockTimer timer;

    public AnalogClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }

    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        if (minute < 10 && second < 10) {
            System.out.printf("Analog clock : %d:0%d:0%d \n", hour, minute, second);
        } else if (minute < 10 && second >= 10) {
            System.out.printf("Analog clock : %d:0%d:%d \n", hour, minute, second);
        } else if(minute >= 10 && second < 10) {
            System.out.printf("Analog clock : %d:%d:0%d \n", hour, minute, second);
        } else {
            System.out.printf("Analog clock : %d:%d:%d \n", hour, minute, second);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        draw();
    }

}
