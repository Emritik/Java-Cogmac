import java.time.*;
import java.time.format.DateTimeFormatter;

//class Vehicle {
//    protected String brand = "Ford";
//
//    public void honk(){
//        System.out.println("Horn Horn......");
//    }
//}
//
//class Car extends Vehicle {
//    private String model_Brand = "Mastang";
//
//    public static void main(String[] args) {
//        Car obj = new Car();
//        obj.honk();
//        System.out.println("Car brand is " + obj.brand + " and Car model is "+ obj.model_Brand);
//    }
//
//}

//class OuterClass {
//    static int x = 5;
//
//    class InnerClass {
//        int y = 10;
//    }
//}

public class Main1 {
    public static void main(String[] args) {
//        ;OuterClass obj = new OuterClass();
//        OuterClass.InnerClass innObj = obj.new InnerClass();
//        System.out.println(innObj.y + obj.x);
//        System.out.println(obj.x)
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
        LocalDateTime date_time = LocalDateTime.now();
//        System.out.println(date + " and "+time);
        System.out.println("before format: " + date_time);
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate = date_time.format(newFormat);
        System.out.println("After Format: "+ formattedDate);

    }
}