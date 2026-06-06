import java.util.*;

// Task3
public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        Scanner nums = new Scanner(System.in);
        System.out.println("Please enter three numbers: ");
        
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();
        int num3 = nums.nextInt();

        int largestNum;
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
        }

        if(largestNumber.equalChecker(num1, num2, num3)) {
            System.out.println("All numbers are equal");
        } else {
            if(num1 > num2 && num1 > num3) {
                largestNum = num1;
                // if(num1 > num3) {
                //     largestNum = num1;
                // } else {
                //     largestNum = num3;
                // }
            } else if (num2 > num3) {
                // if(num2 > num3) {
                //     largestNum = num2;
                // } else {
                    largestNum = num2;
                // }
            } else {
                largestNum = num3;
            }
            System.out.println("Largest number is: " + largestNum);
        }
        nums.close();
    }

    public boolean equalChecker(int num1, int num2, int num3) {
        int total;

        total = num1 + num2 + num3;
        if (total % num1 == 0) {
            return true;
        } 

        return false;
    }
}

