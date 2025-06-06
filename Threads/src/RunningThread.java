class NewThread extends Thread {
    @Override
    public void run(){
        String str = "Thread class implemented Thread" + "is Running Successful";
        System.out.println(str);

    }
}

class RunnableThread implements Runnable {
    @Override
    public void run(){
        String str = "Runnable Interface implements Thread" + " is Running Successful";
        System.out.println(str);

    }
}

public class RunningThread {
    public static void main(String[] args){
        NewThread t1 = new NewThread();
        t1.start();

        RunnableThread rt = new RunnableThread();
        Thread t2 = new Thread(rt);
        t2.start();


        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("An error occurred.");
        }
    }
}