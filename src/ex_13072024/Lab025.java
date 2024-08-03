package ex_13072024;

public class Lab025 {
    public static void main(String[] args) {
        // this is about concatination
        int a = 15;
        int b = 10;
        System.out.println(a+b);

        String S1 = "Uma";
        String S2 = "Maheswari";
        System.out.println(S1+S2);

        System.out.println(a+b+S1+S2);
        System.out.println(a+S1+b+S2);
        System.out.println(S1+S2+a+b);
        System.out.println(S1+a+b+S2);
        System.out.println(S1+S2+a+b+S1+S2);
        System.out.println(a+b+S1+S2+a+b);
    }
}
