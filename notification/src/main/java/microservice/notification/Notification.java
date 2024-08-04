package microservice.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @SequenceGenerator(name = "id", sequenceName = "id")
    @GeneratedValue(generator = "id", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer customerId;
    private String message;

}
