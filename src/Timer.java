public class Timer {
    private int hours;
    private int minutes;
    private int seconds;

    public Timer(int hours, int minutes, int seconds) {
        if(hours < 0 || minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("Values for hours, minutes and seconds should be positive");
        }
        if(minutes > 59) {
            throw new IllegalArgumentException("Minutes should be less than or equal to 59");
        }
        if(seconds > 59) {
            throw new IllegalArgumentException("Seconds should be less than or equal to 59");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }




}
