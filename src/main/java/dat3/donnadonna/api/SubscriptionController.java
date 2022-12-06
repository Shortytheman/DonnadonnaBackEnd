package dat3.donnadonna.api;

import dat3.donnadonna.dto.SubscriptionRequest;
import dat3.donnadonna.dto.SubscriptionResponse;
import dat3.donnadonna.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/subscriptions")
public class SubscriptionController {
    SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping
    public List<SubscriptionResponse> getSubscription() {
        return subscriptionService.getSubscriptions();
    }

    @PostMapping
    public SubscriptionResponse addSubscription(@RequestBody SubscriptionRequest body) {
        return subscriptionService.addSubscription(body);
    }
}
