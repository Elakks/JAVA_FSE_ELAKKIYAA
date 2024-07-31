public class PaymentSystemTest {
    public static void main(String[] args) {
        // Using PayPal payment gateway
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalPayment());
        payPalProcessor.processPayment(100.0);

        // Using Stripe payment gateway
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePayment());
        stripeProcessor.processPayment(200.0);
    }
}
