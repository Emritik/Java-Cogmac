
import java.io.IOException;


public class JsonReaderTest {
    public static void main(String[] args) {
        try {
            
//            JsonReader reader = Json.createReader(new FileReader("Data.json"));
//            JsonObject jsonObject = reader.readObject();
//            String name = jsonObject.getString("name");
//            int age = jsonObject.getInt("age");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (IOException e) {
            System.out.println("An error Occurred.");
        }
    }
}