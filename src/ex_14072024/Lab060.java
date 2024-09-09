package ex_14072024;

public class Lab060 {
    public static void main(String[] args) {
        //increment(++) and decrement(--) operators     2 Types: Pre and Post

        // pre increment - ++operand Eg: ++a
        // Pre-increment:  Value is first incremented and then stored in the result
        int pre_a = 10;
        System.out.println(++pre_a);        //value is incremented first and then stored in the expression
        System.out.println(pre_a);
        //Pre increment: expression - 11; value of a - 11

        // post increment - operand++ Eg: a++
        // Post-increment:  Value is stored in the result first and then incremented
        int post_a = 10;
        System.out.println(post_a++);       //value is printed first and then incremented
        System.out.println(post_a);
        //Post-increment: expression - 10; value of a - 11
    }
}
