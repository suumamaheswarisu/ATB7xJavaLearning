package ex_14072024;

public class Lab079 {
    public static void main(String[] args) {
        // Ternary Operator
        // condition ? if true do this : else do that
        // normally boolean will be the answer for int comparison
        boolean Greater_number = 3>5 ? false:true;
        System.out.println(Greater_number);

        int a1 = (10>30) ? 10:30;
        System.out.println(a1);

        String result = 3>5 ? "three":"five";
        System.out.println(result);

        String res = 5>7 ? "5":"seven";
        System.out.println(res);
    }
}
