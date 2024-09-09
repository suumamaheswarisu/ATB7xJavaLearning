package ex_14072024;

public class Lab062 {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(A);                              //10
        System.out.println(++A);                            //11    // expression - incremented and stored
        System.out.println("The value of A is: " + A);      //11

        System.out.println(++A + A);                        //12+12 = 24

        int B = 10;
        System.out.println(B);                              //10
        System.out.println(B++);                            //10   //expression - value os stored and then incremented
        System.out.println("The value of B is: " + B);      //11

        System.out.println(B++ + B);                        //11+12 = 23
    }
}
