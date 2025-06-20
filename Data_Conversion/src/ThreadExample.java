class Counter {
    private int c = 0;

    public synchronized void inc() {
        c++;
    }

    public synchronized int getCounter(){
        return c;
    }
}

public class ThreadExample {
    public static void main(String[] args){
        Counter cnt = new Counter();
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++)
                cnt.inc();
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++)
                cnt.inc();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Counter is " + cnt.getCounter());
    }
}
