package ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Thuliirrezhilan";
        //String s1 = "T h u l i i r";
        //index       |0|1|2|3|4|5|6|
        System.out.println(s1.charAt(3));
        s1.concat("U P ");
        System.out.println(s1);

        // here the concatenated string will get created but will not be stored anywhere.
        //so the String s1 will not be changed
        //the concatenated string exists in the SCP. But not stored or called anywhere

        s1 = s1.concat(" U P");
        System.out.println("The concatenated String is :" + s1);


    }
}
