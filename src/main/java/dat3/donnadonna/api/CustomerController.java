package dat3.donnadonna.api;


import dat3.donnadonna.dto.CustomerResponse;
import dat3.donnadonna.entity.Customer;
import dat3.donnadonna.entity.Subscription;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/customers")
public class CustomerController {

@GetMapping
  public List<CustomerResponse> getCustomers(){
  List<CustomerResponse> liste = new ArrayList<>();
  Subscription subscription = new Subscription();
  liste.add(new CustomerResponse(2,"yo",13,"hal","yo",subscription));
  return liste;
}

}
