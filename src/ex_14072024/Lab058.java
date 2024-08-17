package ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
        int course_fee = 10000;
        float GST = 250.99f;
        //int total_course_value = course_fee+GST; Implicit narrowing is not allowed by JVM
        int total_course_value = course_fee+(int)GST;   //Explicit narrowing is allowed by JVM with a money loss
        System.out.printf("The Actual course value is %d",total_course_value);

    }
}
