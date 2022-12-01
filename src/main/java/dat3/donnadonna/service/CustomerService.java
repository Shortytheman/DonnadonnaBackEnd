package dat3.donnadonna.service;

import dat3.donnadonna.dto.CustomerRequest;
import dat3.donnadonna.dto.CustomerResponse;
import dat3.donnadonna.entity.Customer;
import dat3.donnadonna.repository.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@Service
public class CustomerService {

  private CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public CustomerResponse addCustomer(CustomerRequest customerRequest) {
    if (customerRepository.existsById(customerRequest.getCustomerId())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Kunde med dette id findes allerede.");
    }
    Customer newCustomer = CustomerRequest.getCustomerEntity(customerRequest);
    customerRepository.save(newCustomer);

    return new CustomerResponse(newCustomer);
  }
}
