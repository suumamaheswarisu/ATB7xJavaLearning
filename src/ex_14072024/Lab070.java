package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Thuliir");  //created in heap area
        System.out.println("String is present in Heap: " + s1);
        String s2 = new String("Thuliir");  //created in heap area
        System.out.println("String is present in Heap: " + s2);

        String s3 = s1;
        //here the string s3 and s1 points to the same String
        //No new string is created
        System.out.println("String is present in the Heap area and is the same String s1: " + s3);
    }
}
