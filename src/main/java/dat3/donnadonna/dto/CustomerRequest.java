package dat3.donnadonna.dto;

import dat3.donnadonna.entity.Customer;
import dat3.donnadonna.entity.Subscription;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerRequest {

  int customerId;
  String customerName;
  int customerAge;
  String customerEmail;
  String customerAllergies;
  Subscription subscription;

public static Customer getCustomerEntity(CustomerRequest crq){
 return new Customer(crq.getCustomerId(), crq.getCustomerName(), crq.getCustomerAge(), crq.getCustomerEmail(),
     crq.getCustomerAllergies(), crq.getSubscription());
}

public CustomerRequest(Customer c){
this.customerId = c.getCustomerId();
this.customerName = c.getCustomerName();
this.customerAge = c.getCustomerAge();
this.customerEmail = c.getCustomerEmail();
this.customerAllergies = c.getCustomerAllergies();
this.subscription = c.getSubscription();
}

}
