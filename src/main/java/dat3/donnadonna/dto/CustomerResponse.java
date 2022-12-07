package dat3.donnadonna.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.donnadonna.entity.Customer;
import dat3.donnadonna.entity.Subscription;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerResponse {

  int customerId;
  String customerName;
  int customerAge;
  String customerEmail;
  String customerAllergies;
  Subscription subscription;

public CustomerResponse(Customer c){
  this.customerId = c.getCustomerId();
  this.customerName = c.getCustomerName();
  this.customerAge = c.getCustomerAge();
  this.customerEmail = c.getCustomerEmail();
  this.customerAllergies = c.getCustomerAllergies();
  this.subscription = c.getSubscription();
}



}
