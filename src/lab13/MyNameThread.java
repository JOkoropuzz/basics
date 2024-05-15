package lab13;

public class MyNameThread extends Thread {
    private final Integer synchInt;
    private final String name;

    public MyNameThread(String name, int synchInt) {
        this.name = name;
        this.synchInt = synchInt;
    }

    public void namePrint() {
        System.out.println(this.name);
    }

    @Override
    public void run() {
        synchronized (synchInt) {
            for (int i = 0; i < 10; i++) {
                namePrint();
                synchInt.notify();
                try {
                    synchInt.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
