package ex_13072024;

public class Lab023 {
    public static void main(String[] args) {
        // here we will see more about formatting
        int age = 11;
        System.out.println("your age is -> " + age);

        /**
         * instead of the above concatenation, we can use formatting to print the data as expected.
         * %d - any integer - byte, short, long, int
         * %s - string
         * %c - char
         * %f - float, double
         */
        System.out.printf("your current age is %d", age);
    }
}
