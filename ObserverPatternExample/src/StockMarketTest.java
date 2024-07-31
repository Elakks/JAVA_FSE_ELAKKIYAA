public class StockMarketTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp1");
        Observer webApp = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setPrice(100.50);
        stockMarket.setPrice(102.75);

        // Deregister mobile app and update price
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setPrice(99.00);
    }
}
