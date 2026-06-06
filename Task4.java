import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        
        System.out.println("Please enter a word: ");
        String enteredWord = word.next();

        StringBuilder sb = new StringBuilder();
        
        for(int i = (enteredWord.length() - 1); i >= 0 ; i--) {
            sb.append(enteredWord.charAt(i));
        }

        if(sb.toString().equals(enteredWord)) 
            System.out.println("\nThe input string is a palindrome");
        else 
            System.out.println("\nThe input string is not a palindrome");

        word.close();
    }
}
