package ex_14072024;

//import java.util.Locale;

public class Lab067 {
    public static void main(String[] args) {
        String name = "Praveen";
        //here Praveen created using the assignment operator is stored in the SCP - String Constant Pool
        String nam = new String("Praveen");
        //here Praveen created using the New operators stored in the Heap
        //So name and nam is not the same
        String name1 = new String("UmaMaheswari");
        String Name = "Thuliirrezhilan";
        /**
         * String - a bunch of characters - specified in ""
         * If you press ctrl and click the word String - it is a final class - immutable
         *
         * There are 2 ways to create a String
         * 1. using = operator. Eg: String Name = "Thuliir"; - String will be stored in SCP (String Constant Pool)
         * 2. String name1 = New String (original:"Uma"); - String will be stored as Objects
         */
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("r"));
        System.out.println(name.contains("w"));
    //    System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        System.out.println(name1.charAt(5));
        System.out.println(Name.toUpperCase());
        System.out.println(nam.toUpperCase());
    }
}
