public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void findCustomer(String id) {
        String customer = customerRepository.findCustomerById(id);
        System.out.println(customer);
    }
}
