package kukulam.module.testing.level.E;

public class NumberCalculator {

    /**
     * Calculate average of all numbers from table.
     */
    public double average(int[] numbers) {
        if (numbers.length == 0)
            return 0;

        int sum = sum(numbers);
        return sum/((double)numbers.length);
    }

    /**
     * Sum all number from the table.
     */
    public int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i=2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public int absoluteValue(int number) {
        if (number >= 0) return number;
        return -1*number;
    }

    public int factorial(int n) {
        if (n <= 0) return 0;
        int result = 1;
        for (int i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }

    public Integer max(int[] numbers) {
        if (numbers.length == 0) return null;
        int result = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (result < numbers[i]) result = numbers[i];
        }
        return result;
    }
}
