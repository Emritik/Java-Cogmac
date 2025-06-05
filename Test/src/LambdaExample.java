interface StringOperator{
    String operate(String str);
}

public class LambdaExample {
    public static void main(String[] args){

        StringOperator strOnj = str -> str.toUpperCase();
        System.out.println(strOnj.operate("hello"));

        StringOperator printObj = str -> {
            System.out.println(str);
            return str;
        };

        printObj.operate("World.");

    }
}
