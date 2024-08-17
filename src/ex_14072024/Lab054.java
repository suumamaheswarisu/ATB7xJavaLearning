package ex_14072024;

public class Lab054 {
    public static void main(String[] args) {
        // larger data type will gets printed
        /**
         * byte and byte - int
         * char and char - int
         * short and byte - int             short and byte - don't confuse. it will be int always.
         * int and int - int
         * int and long - long
         * byte and double - double
         * float and int - float
         * float and long - float           float is bigger than long
         * char and double - double
         * int and double - double
         * char and int - int
         * short and char - int             short and char - don't confuse. it will be int always.
         * short and float - float
         */
        byte a = 5;
        byte b = 4;
        int c = a+b;
        System.out.println(c);

        char A1 = 'A'; // as per ASCII code for char A is 65
        char B1 = 'B'; // as per ASCII code for char B is 66
        int C1 = A1+B1; // so, C1 will be 65+66 = 131
        System.out.println(C1);

        // char is also an integer - char also comes under numerical variables

        System.out.println('A' == 65);
        System.out.println('A' == 66);
        System.out.println('B' == 66);
        System.out.println('B' == 69);

    }
}
