package bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Relational {
    @Value("#{100>10}")
    String lessThan;

    @Value("#{100<10}")
    String greaterThanEquals;

    @Value("#{100>=10}")
    String lessThanEquals;

    @Value("#{100<=10}")
    String greaterThan;

    @Value("#{100 gt 10}")
    String gt;
    @Value("#{100 lt 10}")
    String lt;
}
