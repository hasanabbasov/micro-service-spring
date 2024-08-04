package microservice.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudChechHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
