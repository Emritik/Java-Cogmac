import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Read {
    public static void main(String[] args){
        try{
            File myReader = new File("C:\\Users\\Emrit\\IdeaProjects\\Demo\\src\\FIle.txt");
            Scanner sc = new Scanner(myReader);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error Occurred while Opening a file.");
        }
    }
}