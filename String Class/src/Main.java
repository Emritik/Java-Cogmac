public class Main {
    public static void main(String[] args) {
        String s = "It's an example of String class using literal.";
        System.out.println(s);
        String str = new String("Its an example of creation of String class using new keyword.");
//        System.out.println(str.substring(37));
//        s.concat(str);
//        System.out.println(str.trim());
        System.out.println(str.replace("class","Class"));
    }
}