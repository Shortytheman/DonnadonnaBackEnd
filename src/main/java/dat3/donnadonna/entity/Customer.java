package dat3.donnadonna.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int customerId;
  String customerName;
  int customerAge;
  String customerEmail;
  String customerAllergies;

  @OneToOne(cascade = CascadeType.ALL)
  Subscription subscription;


  public Customer(String customerName, int customerAge, String customerEmail, String customerAllergies){
  this.customerName = customerName;
  this.customerAge = customerAge;
  this.customerEmail = customerEmail;
  this.customerAllergies = customerAllergies;
  }

  public Customer(String customerName, int customerAge, String customerEmail, String customerAllergies, Subscription subscription) {
    this.customerName = customerName;
    this.customerAge = customerAge;
    this.customerEmail = customerEmail;
    this.customerAllergies = customerAllergies;
    this.subscription = subscription;
  }
}
