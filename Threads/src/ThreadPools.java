import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String name;

    Task(String str){
        name = str;
    }

    public void run(){
        try{

            for(int i = 0; i <= 5; i++){

                if(i == 0){
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for task name - " + name + " " + ft.format(d));                }
                else{
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " + name + " " + ft.format(d));
                }
                Thread.sleep(1500);
            }
            System.out.println(name + "Complete.");
        }catch (InterruptedException e){
            e.fillInStackTrace();
        }
    }
}


public class ThreadPools {
    static final int MAX_T = 3;
    public static void main(String[] args){
        Runnable r1 = new Task("Task1");
        Runnable r2 = new Task("Task2");
        Runnable r3 = new Task("Task3");
        Runnable r4 = new Task("Task4");
        Runnable r5 = new Task("Task5");
        Runnable r6 = new Task("Task6");

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);

        pool.shutdown();
    }
}
