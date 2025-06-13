abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

    void startEngine(){
        System.out.println("Engine Start...........");
    }
}

class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car: Pressing gas pedal............");
    }

    @Override
    void brake(){
        System.out.println("Car: Applying brakes............");
    }
}

public class AbstractionExample {
    public static void main(String[] args){
        Vehicle obj = new Car();

        obj.startEngine();
        obj.accelerate();
        obj.brake();
    }
}
