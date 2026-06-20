import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 result = new Task7();
        Scanner nums = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();

        System.out.println("Sum: " + result.addNumbers(num1, num2));
        System.out.println("Difference: " + result.subtractNumbers(num1, num2));
        System.out.println("Product: " + result.multiplyNumbers(num1, num2));
        System.out.println("Quotient: " + result.divideNumbers(num1, num2));

        nums.close();
    }

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }
    public int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }
}
