public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();
//        str.replace(1,3,"ABCDE");
//        str.delete(1,3);
//        str.reverse();
        System.out.println("Current capacity: "+str.capacity());
        str.append("Hello world. ");
        System.out.println("Current capacity: " + str.capacity());
        str.append("Now the current capacity will changed.");
        System.out.println("Now the capacity is: " + str.capacity());

    // 16 * 2 + 2 = 34
        System.out.println(str);


    }
}
