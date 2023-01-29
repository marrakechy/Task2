

public class Main {
    public static void main(String[] args) {
        Timer convert = new Timer(0,120,3600);
        System.out.println(convert);

        convert.tick();

        System.out.println(convert);

        convert.addTime(30);

        System.out.println(convert);
    }
}