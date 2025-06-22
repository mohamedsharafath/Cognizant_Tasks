public class Forecast {

    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static double futureValueMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];

        memo[years] = futureValueMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.1; 
        int years = 5;

        double future = futureValue(presentValue, growthRate, years);
        System.out.printf("Recursive Future Value after %d years: %.2f\n", years, future);

        double[] memo = new double[years + 1];
        double futureMemo = futureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Memoized Future Value after %d years: %.2f\n", years, futureMemo);
    }
}
