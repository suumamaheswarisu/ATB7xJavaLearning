package ex_14072024;

public class Lab078 {
    public static void main(String[] args) {
        String Password = "Password@123";
        String New_Password = Password.toLowerCase();
        System.out.println(Password);
        System.out.println(New_Password);

        System.out.println(Password == New_Password);   // checks for the Reference
        System.out.println(Password.equals(New_Password));  // checks for the Content - with case
        System.out.println(Password.equalsIgnoreCase(New_Password));    // checks for the Content - ignoring Case
        // If the case is ignored - Password@123 - password@123 - PASSWORD@123 - PassWord@123 - PASSword@123 are same

        System.out.println(New_Password.substring(3));
        System.out.println(New_Password.substring(3,9));
        System.out.println(New_Password.indexOf("o"));
        System.out.println(New_Password.charAt(5));
        System.out.println(New_Password.length());

    }
}
