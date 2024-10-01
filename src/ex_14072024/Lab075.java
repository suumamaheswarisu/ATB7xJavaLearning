package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("Thuliir");
        String s2 = new String("Thuliir");
        String s3 = new String("Thuliir");
        String s4 = new String("Thuliir");
        String s5 = new String("Thuliir");

        System.out.println("The reference of s1 and s2 is same: " + (s1==s2));
        System.out.println("The reference of s1 and s3 is same: " + (s1==s3));
        System.out.println("The reference of s1 and s4 is same: " + (s1==s4));
        System.out.println("The reference of s1 and s5 is same: " + (s1==s5));
        System.out.println("The content of s1 and s2 is same: " + (s1.equals(s2)));
        System.out.println("The content of s1 and s2 is same: " + (s1.equals(s3)));
        System.out.println("The content of s1 and s2 is same: " + (s1.equals(s4)));
        System.out.println("The content of s1 and s2 is same: " + (s1.equals(s5)));
    }
}
