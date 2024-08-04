package microservice.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import microservice.client.fraud.FraudCheckResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {

    private final FraudChechService fraudChechService;


    @GetMapping(path="{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudChechService.isFraudulentCustomer(customerId);
        log.info("Fraud check for customer", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
