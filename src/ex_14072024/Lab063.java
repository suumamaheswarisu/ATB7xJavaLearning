package ex_14072024;

public class Lab063 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);      //consider this as A+ B
        // A = a++ - 10    expression value is 10; a value is 11
        // B = ++a - 11    expression value is 11+1 = 12; a value is 12
        // A + B = 10 + 12 = 22
        System.out.println("The value of a is: " + a);
    }
}