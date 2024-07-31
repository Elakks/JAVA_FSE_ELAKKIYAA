public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create the repository (concrete implementation)
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        customerService.findCustomer("0711");
    }
}
