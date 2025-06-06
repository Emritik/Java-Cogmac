import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
public class JacksonExample {
    public static void main(String[] args){
        ObjectMapper object = new ObjectMapper();
        try{
            File obj = new File("C:\\Users\\Emrit\\IdeaProjects\\Test\\src\\Data.json");
            MyClass myObject = object.readValue(obj, MyClass.class);
            System.out.println(myObject.getName());
        }
        catch (IOException e){
//            e.printStackTrace();
            System.out.println("An Error Occurred.");
        }
    }
}
