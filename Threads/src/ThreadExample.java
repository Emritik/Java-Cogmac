// By Extending the Thread class

class Mythread extends Thread {
    public void run() {
        String str = "This thread start running......";
        System.out.println(str);
    }
}

public class ThreadExample {
    public static void main(String[] args){
        Mythread myThread = new Mythread();
        myThread.start();
    }
}