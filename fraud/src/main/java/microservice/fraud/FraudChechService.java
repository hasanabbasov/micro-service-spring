package microservice.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudChechService {
    private final FraudChechHistoryRepository fraudChechHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId) {
        fraudChechHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .createdAt(LocalDateTime.now())
                        .isFraudster(false)
                        .build()
        );
        return false;
    }
}
