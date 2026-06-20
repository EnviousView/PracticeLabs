import static java.lang.Math.*;

public class Task9 {

    public static int add(int num1, int num2) {
        return Math.addExact(num1, num2);
    }
    public static int subtract(int num1, int num2) {
        return Math.subtractExact(num1, num2);
    }
    public static int multiply(int num1, int num2) {
        return Math.multiplyExact(num1, num2);
    }
    public static float divide(int num1, int num2) {
        return Math.floorDiv(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Numbers: " + num1 + ", " + num2);
        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));
    }
}
