package dat3.donnadonna.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.donnadonna.entity.Subscription;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionResponse {
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
    String firstDeliveryDate;

    public SubscriptionResponse(Subscription s) {
        this.subscriptionId = s.getSubscriptionId();
        this.customerId = s.getCustomerId();
        this.tamponLight = s.getTamponLight();
        this.tamponRegular = s.getTamponRegular();
        this.tamponMax = s.getTamponMax();
        this.sanitaryTowelLight = s.getSanitaryTowelLight();
        this.sanitaryTowelRegular = s.getSanitaryTowelRegular();
        this.sanitaryTowelMax = s.getSanitaryTowelMax();
        this.sanitaryTowelNight = s.getSanitaryTowelNight();
        this.pantyLinersThin = s.getPantyLinersThin();
        this.pantyLinersRegular = s.getPantyLinersRegular();
        this.pantyLinersGstring = s.getPantyLinersGstring();
        this.deliveryInterval = s.getDeliveryInterval();
        this.firstDeliveryDate = s.getFirstDeliveryDate();
    }
}
