package ex_14072024;

public class Lab068 {
    public static void main(String[] args) {
        String name = "Praveen";
        //here Praveen created using the assignment operator is stored in the SCP - String Constant Pool
        String nam = new String("Praveen");
        //here Praveen created using the New operators stored in the Heap
        //So name and nam is not the same
        System.out.println("The String name will be in the String Constant Pool SCP: " + name);
        System.out.println("The String name will be in the Heap: " + nam);
    }
}
