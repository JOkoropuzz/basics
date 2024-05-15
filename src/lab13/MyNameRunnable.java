package lab13;

import java.util.concurrent.Exchanger;

public class MyNameRunnable implements Runnable {
    private final String name;
    private final Exchanger<Boolean> exchanger;
    private Boolean flag;

    public MyNameRunnable(String name, Exchanger<Boolean> exchanger, Boolean flag) {
        this.name = name;
        this.exchanger = exchanger;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (flag) {
                    System.out.println(getName());
                }
                flag = exchanger.exchange(flag);

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
