//Threads State Demonstration

class TicketBooking implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.fillInStackTrace();
        }

        System.out.println("State of bookingThread while mainThread is waiting: " +
        TicketSystem.mainThread.getState());

        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
    }
}

public class TicketSystem implements Runnable{
    public static Thread mainThread;
    public static TicketSystem ticketSystem;
    @Override
    public void run(){
        TicketBooking ticketBooking = new TicketBooking();
        Thread bookingThread = new Thread(ticketBooking);

        System.out.println("State after creating a bookingThread: " + bookingThread.getState());
        bookingThread.start();

        System.out.println("State after starting a bookingThread: "+ bookingThread.getState());

        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }

        System.out.println("State after Finishing a bookingThread: "+ bookingThread.getState());
    }


    public static void main(String[] args){
        ticketSystem = new TicketSystem();
        mainThread = new Thread(ticketSystem);

        System.out.println("State after creating a main-thread: "+mainThread.getState());
        mainThread.start();
        System.out.println("State after Starting a main-thread: "+mainThread.getState());

    }
}