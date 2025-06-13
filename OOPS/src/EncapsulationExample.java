class Employee {
    private int id;
    private String name;
    private String number;
    private String address;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String num){
        this.number = num;
    }

    public void setAddress(String add){
        this.address = add;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber(){
        return number;
    }

    public String getAddress(){
        return address;
    }


}

public class EncapsulationExample {
    public static void main(String[] args){
        Employee obj = new Employee();

        obj.setId(7);
        obj.setName("Anu");
        obj.setNumber("9874563215");
        obj.setAddress("Ghaziabad");

        System.out.println("Id : " + obj.getId());
        System.out.println("Name : " + obj.getName());
        System.out.println("Address : " + obj.getAddress());
        System.out.println("Phone Number : " + obj.getNumber());

    }
}
