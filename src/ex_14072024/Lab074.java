package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String s1 = "I am getting th Java Automation knowledge from TTA";
        String s2 = "I am getting th Java Automation knowledge from TTA";
        //here only one String will get creates
        System.out.println("Checking if the Strings have the same ref: " + (s1==s2)); // checks for the reference of the Strings created are the same
        System.out.println("Checking if the Strings have the same content: " + (s1.equals(s2))); // checks for the contents of the Strings are the same

        String s3 = new String("I am getting th Java Automation knowledge from TTA");
        System.out.println("Checking if the Strings have the same ref: " + (s1==s3));
        System.out.println("Checking if the Strings have the same content: " + (s1.equals(s3)));
    }
}
