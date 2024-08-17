package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        long phone_number = 9442158842l;
        // short Short_phone_number = phone_number;  Narrowing implicit casting is not possible
        short Short_phone_number = (short)phone_number;  //Narrowing explicit casting is possible with data loss
        System.out.println(Short_phone_number);
    }
}
