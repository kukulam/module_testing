package kukulam.module.testing.level.E;

public class NumberCalculatorImplementation implements NumberCalculator {
    @Override
    public double average(int[] numbers) {
        if (numbers.length == 0)
            return 0;

        int sum = sum(numbers);
        return sum/((double)numbers.length);
    }

    @Override
    public int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
