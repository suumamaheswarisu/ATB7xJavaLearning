package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        /**
         * Type Casting () - 2 Types
         * 1. Implicit casting - no need to specify the data tyoe - JVM will automatically take care of this
         * 2. Explicit casting - Specifying the data type to be used. Narrowing or widening of the data storage
         * there are 2 types of data type conversion -
         */
        byte b = 10;
        int i = b;      //valid implicit casting - no need to specific - JVM assumes it in the same way.
        int i1 = (int)b;      //valid explicit casting
        System.out.println(i);
        System.out.println(i1);

        //if intelliJ is displaying anything in grey - it means the info is not used or useful

        //invalid casting
        int i2 = 300;
        // byte b1 = i2;    this implicit casting is not valid. SO we need to explicit casting - Narrowing
        byte b1 = (byte)i2;     // explicit casting should be done to store the value.
        // here int memory storage is 32 bits and byte memory storage is 8 bits - last 8 bits of the int value
        //here 300 will be converted into byte value, then the last 8 bits will be converted
        // this leads to lose in the value
        System.out.println(b1);

    }
}