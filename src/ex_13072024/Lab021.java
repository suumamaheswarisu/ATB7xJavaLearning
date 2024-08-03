package ex_13072024;

public class Lab021 {
    public static void main(String[] args) {
        int _123 = 987;
        System.out.println(_123);
        //this is valid variable name. So the code will not throw any error
        int $123 = 123;
        System.out.println($123);
        //this is valid variable name. So the code will not throw any error
        short A123 = 211;
        System.out.println(A123);
        //this is valid variable name. So the code will not throw any error
        /**
         * int @123 = 123;
         * this is not valid variable name. So the code will throw an error. Invalid variable name is used.
         * only _ and $ is allowed at the beginning of the variable name
         * int 123 = 123;
         * this is not valid variable name. So the code will throw an error. Invalid variable name is used.
         * numeric values should not be used in the beginning of the variable name
         */
    }
}