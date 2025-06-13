class Student {
    private final int id;
    private final String name;

    public Student(int _id, String _name) {
        this.id = _id;
        this.name = _name;
    }

    public void printf(){
        System.out.println("Student details: ");
        System.out.println("Student Id: " + getID());
        System.out.println("Student Name: " + getName());
    }

    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
}


public class MethodPassingExample {
    public static  void main(String[] args){
//        System.out.println("hello world.");
        Student st = new Student(35,"Anu");
        st.printf();
    }
}
