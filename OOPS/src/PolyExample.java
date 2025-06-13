class Parent {
    public void func() {
        System.out.println("Parent.func()");
    }

    public void func(int a) {
        System.out.println("Parent.func(int): " + a);
    }
}

class Child extends Parent {
    @Override
    public void func(int a) {
        System.out.println("Child.func(int): " + a);
    }
}

public class PolyExample {
    public static void main(String[] args){
        Parent obj1 = new Parent();
        Child obj2 = new Child();
        Parent obj3 = new Child();

        obj1.func();
        obj1.func(10);
//        obj2.func();
        obj2.func(20);
        obj3.func(30);
    }
}
