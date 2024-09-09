package ex_14072024;

public class Lab061 {
    public static void main(String[] args) {
        // Pre-increment:  Value is first incremented and then stored in the result
        int a = 10;
        int pre$a = ++a;
        System.out.println(pre$a);
        System.out.println(a);        //value is incremented first and then stored in the expression
        System.out.println(pre$a);
        //Pre increment: expression - 11; value of a - 11

        // post increment - operand++ Eg: a++
        // Post-increment:  Value is stored in the result first and then incremented
        int post_a = 10;
        int post$a = post_a++;
        System.out.println(post$a);
        System.out.println(post_a);       //value is printed first and then incremented
        System.out.println(post$a);
        //Post-increment: expression - 10; value of a - 11
    }
}
