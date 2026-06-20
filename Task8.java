public class Task8 {
    public static void main(String[] args) {
        Task8 result = new Task8();
        result.cumulativeSum(new int[] {4, 5, 10});
    }

    public int cumulativeSum(int [] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                sum += j;
            }
            System.out.println("Cumulative sum for " + numbers[i] + " is: " + sum);
        }
        return sum;
    }
}
