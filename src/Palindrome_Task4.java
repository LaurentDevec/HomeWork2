import java.util.Scanner;

public class Palindrome_Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your word or sentence: ");
        String n = in.nextLine();
        String b = n.replaceAll(" ", "");

        String m = new StringBuffer(b).reverse().toString();



        System.out.println(b.equals(m));
        if (b.equals(m) == true) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
