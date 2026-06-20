import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.time.*;

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

        StringBuilder puzzle = new StringBuilder("Java");
         puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
        System.out.println(puzzle);

        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        word.close();
    }
}
