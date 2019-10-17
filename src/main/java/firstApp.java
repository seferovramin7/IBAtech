import java.util.Random;
public class firstApp {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(getRandomNumberInRange(10, 20) + ",");
        }

    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1 ) + min;
    }

}

