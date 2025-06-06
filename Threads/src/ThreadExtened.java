class ThreadCopy extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Current Thread "+ Thread.currentThread().getName() + " - count " + i);

            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.fillInStackTrace();
            }
        }
    }
}


public class ThreadExtened {
    public static void main(String[] args){
        ThreadCopy t1 = new ThreadCopy();
        ThreadCopy t2 = new ThreadCopy();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}