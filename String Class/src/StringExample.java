// setLength() method will sets the length of the string they will fix the size and amke changes in the current string.
// if the length will reduce/increases then string was changed according to the size of the string.

public class StringExample {
    public static void main(String[] args){
        StringBuilder stringbuilder = new StringBuilder("Hello world.");
        System.out.println("The length of string is " + stringbuilder.length() + " and the string is " + stringbuilder);

//         Method - 1
//         reduce the length by half.
//        stringbuilder.setLength(6);
//        System.out.println("New length od the string is " + stringbuilder.length() + " and the new string is " + stringbuilder);
//         the length of the string will increase then the string was added some extra space at the end of the current string.
//          Method - 2
//        stringbuilder.setLength(20);
//        System.out.println("New length od the string is " + stringbuilder.length() + " and the new string is " + stringbuilder);
//         Method - 3
//         if passes the negative length then it was passed an error like->
//        stringbuilder.setLength(-10);
//        try{
//            stringbuilder.setLength(-10);
//        } catch (Exception e) {
//            e.fillInStackTrace();
//        }

        stringbuilder.setLength(6);
        System.out.println("New length od the string is " + stringbuilder.length() + " and the new string is " + stringbuilder);

    }
}
