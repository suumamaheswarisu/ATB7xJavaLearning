package ex_13072024;

public class Lab029 {
    public static void main(String[] args) {
        //calculator
        double a = 10;
        double b = 14;

        double sum = a+b;
        double sub = a-b;
        double mul = a*b;
        double div = a/b;
        //double div = a+a          not possible as the variable name div cannot be declared twice
        System.out.printf("Sum is %f\n",sum);
        System.out.printf("Sub is %f",sub);
        System.out.println();
        System.out.printf("Mul is %f\n",mul);
        System.out.printf("Div is %f\n",div);
        /**
         * use \n while using the printf function to move on to the next line.
         * else type empty println function
         */
    }
}
