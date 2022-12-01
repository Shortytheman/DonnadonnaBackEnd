package dat3.donnadonna.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer {

  @Id
  int customerId;
  String customerName;
  int customerAge;
  String customerEmail;
  String customerAllergies;
  int subscriptionId;

  public Customer(String customerName, int customerAge, String customerEmail, String customerAllergies){
  this.customerName = customerName;
  this.customerAge = customerAge;
  this.customerEmail = customerEmail;
  this.customerAllergies = customerAllergies;
  }

}
