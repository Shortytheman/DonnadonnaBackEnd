package dat3.donnadonna.service;


import dat3.donnadonna.dto.SubscriptionRequest;
import dat3.donnadonna.dto.SubscriptionResponse;
import dat3.donnadonna.entity.Subscription;
import dat3.donnadonna.repository.SubscriptionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubscriptionService {

    private SubscriptionRepository subscriptionRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public List<SubscriptionResponse> getSubscriptions() {
        List<Subscription> subscriptions = subscriptionRepository.findAll();

        List<SubscriptionResponse> response = subscriptions.stream().map(subscription -> {
            return new SubscriptionResponse(subscription);
        }).collect(Collectors.toList());

        return response;
    }

    public SubscriptionResponse addSubscription(SubscriptionRequest subscriptionRequest) {
        Subscription newSubscription = SubscriptionRequest.getSubscriptionEntity(subscriptionRequest);
        if (subscriptionRepository.existsById(newSubscription.getSubscriptionId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Subscription med dette id findes allerede.");
        }
        subscriptionRepository.save(newSubscription);

        return new SubscriptionResponse(newSubscription);
    }
}
