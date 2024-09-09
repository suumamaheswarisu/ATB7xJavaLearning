package ex_14072024;

public class Lab065 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // here A = ++a = 11
        // here B = a++ = 11
        // here C = a++ = 12
        // so A + B + C = 11+11+12 = 34
        System.out.println(a);
        // here the value of a is 13
    }
}
