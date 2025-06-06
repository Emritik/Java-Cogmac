import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader obj = new FileReader("C:\\Users\\Emrit\\IdeaProjects\\Test\\src\\Data.json");
//            String jsonString = "{\"name\":\"John\", \"age\":30}";
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(obj, JsonObject.class);

            String name = jsonObject.get("name").getAsString();
            int age = jsonObject.get("age").getAsInt();
            String email = jsonObject.get("email").getAsString();
            String phone = jsonObject.get("phone").getAsString();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phone);
        }
        catch(FileNotFoundException e) {
            System.out.println("An Error Occurred.");
        }
    }
}