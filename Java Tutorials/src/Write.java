import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Write {
    public static void main(String[] args){
        try{
            // Firstly I create a new file with name of WriteFile.txt
            File myObj = new File("WriteFile.txt");
            // Here we are creating a new file.
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
            else{
                System.out.println("File Already Exist!!");
            }
            // create a new object for write a file.
            FileWriter myWriter = new FileWriter(myObj.getName());
            myWriter.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
            myWriter.close();
            System.out.println("Successfully Write.");
        }
        catch(IOException e){
            System.out.println("An Error Occurred.");
        }
    }
}