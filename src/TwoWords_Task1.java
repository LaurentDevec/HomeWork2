import java.util.Scanner;

public class TwoWords_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first word, containing even number of letters: ");
        String word1 = in.nextLine();
        System.out.println("Enter your second word, containing even number of letters: ");
        String word2 = in.nextLine();


        System.out.println("Первое слово = " + word1);
        System.out.println("Второе слово = " + word2);
        String word3 = (word1.substring(0, word1.length()/2)) +
               (word2.substring(word2.length()/2, word2.length()));
        System.out.println(word3);
    }
}
