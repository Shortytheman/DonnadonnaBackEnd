package dat3.donnadonna.api;


import dat3.donnadonna.dto.CustomerRequest;
import dat3.donnadonna.dto.CustomerResponse;
import dat3.donnadonna.entity.Customer;
import dat3.donnadonna.entity.Subscription;
import dat3.donnadonna.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/customers")
public class CustomerController {

  CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public List<CustomerResponse> getCustomers() {
    List<CustomerResponse> liste = new ArrayList<>();
    Subscription subscription = new Subscription();
    liste.add(new CustomerResponse(2, "yo", 13, "hal", "yo", subscription));
    return liste;
  }

  @PostMapping
  public CustomerResponse addCustomer(@RequestBody CustomerRequest body) {
    return customerService.addCustomer(body);
  }

}
