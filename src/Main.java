

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer(1, 30, 45);
        System.out.println(timer);
        timer.tick();
        System.out.println(timer);
        timer.addTime(30);
        System.out.println(timer);
    }
}