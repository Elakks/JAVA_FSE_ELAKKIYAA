public class FinancialForecastingSystem {
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();

        double currentValue = 10000.0; // Current value of the investment
        double growthRate = 0.05; // Expected annual growth rate (5%)
        int years = 5; // Number of years for the forecast

        double futureValue = forecast.calculateFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: $" + futureValue);

        double initialValue = 8000.0; // Initial value of the investment
        double finalValue = 12000.0; // Final value of the investment after a certain period
        int periodYears = 3; // Number of years between initial and final values

        double cagr = forecast.calculateCAGR(initialValue, finalValue, periodYears);
        System.out.println("Compound Annual Growth Rate (CAGR): " + (cagr * 100) + "%");
    }
}
