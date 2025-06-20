// A Java program for a serverSide
import java.io.*;
import java.net.*;

public class ServerSide {

    // initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    // constructor with port
    public ServerSide(int port)
    {

        // starts server and waits for a connection
        try {
            server = new ServerSocket(port);

            System.out.println("Server started");

            System.out.println("Waiting for a client ...");

            socket = server.accept();

            System.out.println("Client accepted");

            // takes input from the client socket
            in = new DataInputStream(
                    new BufferedInputStream(
                            socket.getInputStream()));

            String line = "";

            // reads message from client until "End" is sent
            while (!line.equals("End")) {

                try {

                    line = in.readUTF();

                    System.out.println(line);
                }

                catch (IOException i) {

                    System.out.println(i);
                }
            }

            System.out.println("Closing connection");

            // close connection
            socket.close();

            in.close();
        }

        catch (IOException i) {

            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {

        ServerSide server = new ServerSide(5000);
    }
}