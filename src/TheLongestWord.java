import java.util.Scanner;

public class TheLongestWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String someSentence = in.nextLine();


        String[] mas_str = someSentence.split("[\\s,.!?]+");

        String maxWord = mas_str[0];

        for(int i = 1; i < mas_str.length; ++i){
            if(maxWord.length() < mas_str[i].length())
                maxWord = mas_str[i];
        }

        System.out.println("The longest word is: " + maxWord);
       
        
        

        }
    }




