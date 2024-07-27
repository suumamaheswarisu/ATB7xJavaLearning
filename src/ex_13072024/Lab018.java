package ex_13072024;

public class Lab018 {
    public static void main(String[] args) {
        // Interview Question
        // byte b = 128; // byte can store only upto 127. Smaller container
        short s = 128; // this is valid

        char a = 'A';
        char b = '$';
        char c = '\n';  // new line
        char d = '\u1F6A';   // even smileys have their own unicode character
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
