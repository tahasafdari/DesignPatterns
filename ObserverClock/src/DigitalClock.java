import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }

    private void draw(Object arg) {
        int hour = ((int[]) arg)[2];
        int minute = ((int[]) arg)[1];
        int second = ((int[]) arg)[0];

        if (minute < 10 && second < 10) {
            System.out.printf("Time is : %d:0%d:0%d \n", hour, minute, second);
        } else if (minute < 10 && second >= 10) {
            System.out.printf("Time is : %d:0%d:%d \n", hour, minute, second);
        } else if(minute >= 10 && second < 10) {
            System.out.printf("Time is : %d:%d:0%d \n", hour, minute, second);
        } else {
            System.out.printf("Time is : %d:%d:%d \n", hour, minute, second);
        }


    }

    @Override
    public void update(Observable o, Object arg) {
        draw(arg);
    }

}
