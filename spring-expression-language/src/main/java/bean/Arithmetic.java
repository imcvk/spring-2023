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
public class Arithmetic {
    @Value("#{1+1}")
    int addition;
    @Value("#{2-1}")
    int subtraction;
    @Value("#{2*2}")
    int multiplication;
    @Value("#{10/2}")
    int division;
    @Value("#{100%2}")
    int mod;
    @Value("#{100 div 2}")
    int div;

}
