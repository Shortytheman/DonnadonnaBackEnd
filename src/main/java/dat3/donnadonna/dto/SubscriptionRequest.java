package dat3.donnadonna.dto;

import dat3.donnadonna.entity.Subscription;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubscriptionRequest {
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

        // deliveryInterval can be either one of:
        //MONTHLY
        //QUARERTLY
        //HALFYEARLY

    public static Subscription getSubscriptionEntity(SubscriptionRequest srq){
        return new Subscription(srq.getSubscriptionId(), srq.getCustomerId(), srq.getTamponLight(),
                srq.getTamponRegular(), srq.getTamponMax(), srq.getSanitaryTowelLight(), srq.getSanitaryTowelRegular(),
                srq.getSanitaryTowelMax(), srq.getSanitaryTowelNight(), srq.getPantyLinersThin(),
                srq.getPantyLinersRegular(), srq.getPantyLinersGstring(), srq.getDeliveryInterval(),
                srq.getFirstDeliveryDate());
    }

        public SubscriptionRequest(Subscription s) {
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
