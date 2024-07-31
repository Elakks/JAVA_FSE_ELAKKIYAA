public class PaymentSystemTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment("1234-5678-9876-5432"));
        paymentContext.executePayment(250.0);

        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.executePayment(100.0);
    }
}
