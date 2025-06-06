class Counter {
    private int count = 0;

    public synchronized void inc(){
        count++;
    }

    public int getInc(){
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    CounterThread(Counter counter){
        this.counter = counter;
    }
    @Override public void run(){
        System.out.println("Running the Thread.");

        for(int i = 1; i <= 1000; i++){
            counter.inc();
        }
    }
}

public class ConcurrentSolution {
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        Thread t3 = new CounterThread(counter);
        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Counter is: " + counter.getInc());
    }
}
