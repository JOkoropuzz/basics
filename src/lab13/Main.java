package lab13;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        //ex1, ex2
        try (ExecutorService executorService1 = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 10; i++) {
                executorService1.submit(new RandomRunnable());
            }
            executorService1.shutdown();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //ex3
        Counter counter = new Counter();
        try (ExecutorService executorService2 = Executors.newCachedThreadPool()) { //Pool of Cached Threads
            for (int i = 0; i < 100; i++) {
                executorService2.submit(() -> { //Submit 100 new threads (lambda expression = new Runnable{} with overriding "run" method.).
                    synchronized (counter) { //Synchronization on counter
                        for (int j = 0; j < 1000; j++) {
                            counter.increment();
                        }
                    }

                });
            }
            executorService2.shutdown();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println(counter.getCount());

        //ex4
        Exchanger<Boolean> exchanger = new Exchanger<>(); //Flag tacking
        try (ExecutorService executorService3 = Executors.newCachedThreadPool()) {
            executorService3.submit(new MyNameRunnable("I'm Biba!", exchanger, true));
            executorService3.submit(new MyNameRunnable("Am I Boba?", exchanger, false));
            executorService3.shutdown();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
