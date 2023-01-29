public class Timer {
    private int hours;
    private int minutes;
    private int seconds;

    public Timer(int hours, int minutes, int seconds) {
        if(hours < 0 || minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("Values for hours, minutes and seconds should be positive");
        }
        if(minutes > 59 && hours != 0) {
            throw new IllegalArgumentException("Minutes should be less than or equal to 59");
        }
        if (seconds > 59 && minutes != 0 && hours != 0){
            throw new IllegalArgumentException("Seconds should be less than or equal to 59");
        }
        convert(seconds, minutes, hours);
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


    public void convert(int seconds, int minutes, int hours) {
        this.hours = hours;
        this.minutes=minutes;
        this.seconds = seconds;

        this.minutes += (this.seconds / 60);
        this.seconds = this.seconds - (this.seconds / 60) *60;

        this.hours += this.minutes / 60;
        this.minutes = this.minutes - (this.minutes / 60)*60;

        //for Decrement(int newSeconds){
        //    totalSeconds = this.hours * 3600 + this.minutes*60;
        //}
        }
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public void addTime(int seconds) {
        if(seconds < 0)
        {
            throw new IllegalArgumentException("Seconds should be positive");
        }
        this.seconds += seconds;
        if(this.seconds >= 60)
        {
            this.seconds -= 60;
            this.minutes++;


            if(this.minutes >= 60)
            {
                this.minutes -= 60;
                this.hours++;
            }
        }
    }


    public void tick() {
        if(this.hours == 0 && this.minutes == 0 && this.seconds == 0) {
            System.out.println("beep");
        }
        else {
            this.seconds--;

            if(this.seconds < 0) {
                this.seconds = 59;
                this.minutes--;

                if(this.minutes < 0) {
                    this.minutes = 59;
                    this.hours--;
                }
            }
        }
    }





}
