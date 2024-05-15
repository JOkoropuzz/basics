package lab13;

import java.util.Random;

public class RandomRunnable implements Runnable {
    private final int randomInt;
    Random rn = new Random();

    RandomRunnable() {
        this.randomInt = rn.nextInt(100);
    }

    @Override
    public void run() {
        System.out.println("Start new thread");
        System.out.println(randomInt);
        System.out.println("Shutdown thread");
    }
}
