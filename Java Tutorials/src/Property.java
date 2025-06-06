import java.io.*;
import java.util.*;

public class Property {
    public static void main(String[] args){
        try{
            FileReader myReader = new FileReader("db.properties");
            Properties p = new Properties();

            p.load(myReader);
            p.setProperty("port","8080");
            p.put("localHost","127.0.0.0");

            p.store(new FileOutputStream(new File("db.properties")),"Add new list");
            System.out.println("Username = " + p.getProperty("username"));
            System.out.println("Password = " + p.getProperty("password"));
            System.out.println("Port Number : " + p.getProperty("port"));
        }
        catch(FileNotFoundException e){
            System.out.println("An Error Occurred.");
        }
        catch (IOException e){
            System.out.println("IOException Occurred.");
        }
    }
}
