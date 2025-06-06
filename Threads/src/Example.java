import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import com.fasterxml.jackson.databind.JsonNode;

public class Example {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\Emrit\\IdeaProjects\\Test\\src\\Data.json"));
        String name = jsonNode.get("name").asText();
        int age = jsonNode.get("age").asInt();
        System.out.println(name);
        System.out.println(age);
    }
}
