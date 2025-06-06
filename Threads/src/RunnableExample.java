// Using Runnable Interface

class Myrunnable implements Runnable{

    public void run(){
        String str = "Thread is running Successful.";
        System.out.println(str);
    }
}


public class RunnableExample {

    public static void main(String[] args){

        Myrunnable myRun = new Myrunnable();
        Thread thObj = new Thread(myRun);

        thObj.start();
    }

}
