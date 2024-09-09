package ex_14072024;

public class Lab064 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++);
        // here A = ++a = 11
        // here B = a++ = 11
        // so A + B = 11+11 = 22
        System.out.println(a);
        // here the value of a is 12

        System.out.println("\n");

        int A = 10;
        System.out.println(++A + ++A);
        // here A = ++A = 11
        // here B = ++A = 12
        // so A + B = 11+12 = 23
        System.out.println(A);
        // here the value of a is 12
    }
}
