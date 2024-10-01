package ex_14072024;

public class Lab073 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " Guys";
        String s3 = "Hello Guys";
        String s4 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // here we have 4 Strings stored in the SCP
        // even though the s3 and s4 looks to be same, the string concatenation will create a new string in the SCP.
    }
}
