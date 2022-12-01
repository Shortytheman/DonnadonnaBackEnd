package dat3.donnadonna.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Subscription {


  @Id
  int subscriptionId;

  int customerId;

  int tamponLight;
  int tamponRegular;
  int tamponMax;

  int sanitaryTowelLight;
  int sanitaryTowelRegular;
  int sanitaryTowelMax;
  int sanitaryTowelNight;

  int pantyLinersThin;
  int pantyLinersRegular;
  int pantyLinersGstring;

  String deliveryInterval;

  // deliveryInterval can be either one of:
  //MONTHLY
  //QUARERTLY
  //HALFYEARLY

}
