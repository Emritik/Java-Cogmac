import java.io.*;
import java.lang.Thread;
/*

Method-1


public class Sleepthread {
    public static void main(String[] args){
        try{
            for(int i = 0; i < 10; i++){

                Thread.sleep(2000);
                System.out.print(i + " ");
            }
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }
}
*/
//Method-2

class Sleepthread extends Thread {
    @Override
    public void run(){
        try{

            for(int i = 0; i < 5; i++){
                Thread.sleep(2000);

                System.out.print(i + " ");
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    public static void main(String[] args){
        Sleepthread t1 = new Sleepthread();
        t1.start();
    }
}
/*
Method-03 (IllegalArgumentException)

public class Sleepthread{
    public static void main(String[] args){
        try{
            for(int i = 0; i < 5; i++){

                Thread.sleep(-100);

                System.out.print(i + " ");
            }
        }catch (IllegalArgumentException e){
            e.fillInStackTrace();
        }
    }
}

 */