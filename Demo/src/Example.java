import java.util.*;

public class Example {
    public static void main(String[] args) throws Exception {
        Properties sysObj = System.getProperties();
//        sysObj.setProperty("checked","true");

        Set<Map.Entry<Object, Object>> set = sysObj.entrySet();

        for (Map.Entry<Object, Object> entry : set) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
