package ex_13072024;

public class Lab015 {
    public static void main(String[] args) {
        /**
         * This is all about DataTypes:
         * 1. 2 major types - Primitive and Non-primitive (Reference)
         * 2. Primitive - Cannot be further divided.
         * 3. 2 major sub-divisions in primitive - 1st is Boolean and 2nd is Numberic
         * 4. Numeric datatype further divided into 2 sub-divisions - Integral and floating point
         * 5. Integral - byte, short, int, long, char
         * 6. Floating point - float, double
         *
         *boolean - only have true or false value - default value is false
         *
         * byte - 8 bit - can store only (-127 to 128) - 1 Byte - default value is 0
         * short - 16 bit - 2 Byte - 1 Byte - default value is 0
         * int - 32 bit - 4 Byte - default value is 0
         * long - 64 bit - 8 Byte - default value is 0
         * char - 16 bit - 2 Byte - default value is 0
         *
         * float - 32 bit - 4 Byte - default value is 0.0
         * double - 64 bits - 8 Byte - default value is 0.0
         *
         * any other reference types - Eg:String, (Object)class, enum - 64 bits - 8 Byte - default value is null
         */
        boolean are_you_married = true;
        boolean are_you_remarried = false;
        boolean do_you_love_dogs = are_you_married;
        System.out.println(are_you_married);
        System.out.println(are_you_remarried);
        System.out.println(do_you_love_dogs);

        byte mybyte = 101;
        short s = 1001;
        int num = 10001;
        int neg_int = -1100220033;
        long l = 113355L;
        long PhoneNumber = 9087541321231L;
        char grade = 'O'; // O for OutStanding by the way :)
        float Pi = 3.14F;
        double D = 1000.121314254136546;

        System.out.println(mybyte);
        System.out.println(s);
        System.out.println(num);
        System.out.println(neg_int);
        System.out.println(l);
        System.out.println(PhoneNumber);
        System.out.println(grade);
        System.out.println(Pi);
        System.out.println(D);
        System.out.println("All these are Primitive Datatypes");
        System.out.println("#############################################");
        System.out.println("Now comes the Non-primitive data types - String");

        //Collection of primitive data types is Non-primitive data type
        //we need to use single quote for Char definition
        //Double quote for String definition
        String name = "Uma"; // Contains 3 chars - Char 'U', 'm' and 'a'
        System.out.println(name);

    }
}
