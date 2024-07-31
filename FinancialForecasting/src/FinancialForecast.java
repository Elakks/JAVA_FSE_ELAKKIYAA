public class FinancialForecast {
    /**
     * Calculate future value using recursive approach
     * @param currentValue The current value
     * @param growthRate The annual growth rate as a decimal (e.g., 0.05 for 5%)
     * @param years The number of years to project into the future
     * @return The predicted future value
     */
    public double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        } else {
            return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
        }
    }

    /**
     * Calculate Compound Annual Growth Rate (CAGR)
     * @param initialValue The initial value
     * @param finalValue The final value
     * @param years The number of years between the initial and final values
     * @return The CAGR as a decimal
     */
    public double calculateCAGR(double initialValue, double finalValue, int years) {
        return Math.pow(finalValue / initialValue, 1.0 / years) - 1;
    }
}
