package homeworks;

import java.util.Random;

public class Dz21062023 {
    public static void main(String[] args) {
        Random r = new Random();

        int w = 3600;
        int n = r.nextInt(0, 28801);

        System.out.println("осталось " + n + " секунд");
        System.out.println("осталось " + n / w + " полных часов" );
    }
}
