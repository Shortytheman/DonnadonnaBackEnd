package dat3.donnadonna.service;

import dat3.donnadonna.dto.CustomerRequest;
import dat3.donnadonna.dto.CustomerResponse;
import dat3.donnadonna.dto.SubscriptionRequest;
import dat3.donnadonna.entity.Customer;
import dat3.donnadonna.entity.Subscription;
import dat3.donnadonna.repository.CustomerRepository;
import dat3.donnadonna.repository.SubscriptionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

  private CustomerRepository customerRepository;
  private SubscriptionRepository subscriptionRepository;

  public CustomerService(CustomerRepository customerRepository, SubscriptionRepository subscriptionRepository) {
    this.customerRepository = customerRepository;
    this.subscriptionRepository = subscriptionRepository;
  }

  public CustomerResponse addCustomer(CustomerRequest customerRequest) {

    Customer newCustomer = CustomerRequest.getCustomerEntity(customerRequest);
    Subscription newSubscription = customerRequest.getSubscription();

    Customer tempCustomer = customerRepository.save(newCustomer);
    newSubscription.setCustomerId(tempCustomer.getCustomerId());
    subscriptionRepository.save(newSubscription);

    return new CustomerResponse(newCustomer);
  }

  public List<CustomerResponse> getCustomers() {
    List<Customer> customers = customerRepository.findAll();
    List<CustomerResponse> response = customers.stream().map(customer -> new CustomerResponse(customer)).collect(Collectors.toList());
    return response;
  }


}
