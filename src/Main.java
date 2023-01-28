

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer(1, 30, 45);
        System.out.println(timer); // 01:30:45
        timer.tick();
        System.out.println(timer); // 01:30:44
        timer.addTime(30);
        System.out.println(timer); // 01:31:14
    }
}