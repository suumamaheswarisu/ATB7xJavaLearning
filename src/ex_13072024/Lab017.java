package ex_13072024;

public class Lab017 {
    public static void main(String[] args) {
        /**
         * lets think which data type we need to choose for declaring age variable
         * max age of a human - 123 - as per google
         * so this comes under byte itself
         * it is smart to declare the age variable with byte.
         * byte - less memory - small container - good practise
         * this can be declared using larger container like integer as well
         * But thats waste of memory
         */
        byte age = 123; //small container - less memory has been used
        int age_int = 123; // large container - memory space wasted due to large memory allocation

        // for a program, it is required to store the value of Pi [(3.14) - 2 decimal point is enough] in the variable.
        float pi = 3.14f;
        double pi_double = 3.141586956736532451452;
        //here using float is more appropriate. use of double is unnecessary
        // byte -> data type
        // Byte -> Memory allocation


    }
}
