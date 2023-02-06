import java.util.Observable;
import java.time.LocalDateTime;

public class ClockTimer extends Observable {
    int hour, minute, second;

    public ClockTimer() {

        this.hour = LocalDateTime.now().getHour();;
        this.minute = LocalDateTime.now().getMinute();;
        this.second = LocalDateTime.now().getSecond();;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    void tick() {

        this.second++;

        if (this.second == 60) {

            this.second = 0;
            this.minute++;
        }

        if (this.minute == 60) {

            this.hour++;
            this.minute = 0;
        }

        if (this.hour == 24) {
            this.hour = 0;
        }

        setChanged();
        notifyObservers(new int[] {second, minute, hour});

    }


}
