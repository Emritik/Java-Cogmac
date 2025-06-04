import java.util.ArrayList;
import java.util.Collections;
/*
interface Animal {
    public void animalSound();
    public void sleep();
}

interface First {
    public void myMethod();
}

interface Second {
    public void otherMethod();
}

class Third implements First, Second {
    public void myMethod() {
        System.out.println("This is the first Method");
    }
    public void otherMethod() {
        System.out.println("This is the Second Method");
    }
}


class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee ");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}
*/
public class Interface {
    public static void main(String[] args) {

/*        Pig obj = new Pig();
        obj.animalSound();
        obj.sleep();
        Third obj = new Third();
        obj.myMethod();
        obj.otherMethod();
*/
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Bmw");
        cars.add("Audi");
        cars.add("Ford");
        System.out.println(cars.size());
//        for(String i : cars) {
//            System.out.println(i);
//        }
        Collections.sort(cars);
        System.out.println(cars);
    }
}
