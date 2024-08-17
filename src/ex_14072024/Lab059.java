package ex_14072024;

public class Lab059 {
    public static void main(String[] args) {
        int course_fee = 10000;
        float GST = 250.99f;
        //int total_course_value = course_fee+GST; Implicit narrowing is not allowed by JVM
        float total_course_value = course_fee+GST;   //Explicit narrowing is allowed by JVM with a money loss
        System.out.printf("The Actual course value is %f\n",total_course_value);

    }
}
