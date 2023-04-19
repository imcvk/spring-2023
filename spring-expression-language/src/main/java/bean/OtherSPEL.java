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
public class OtherSPEL {
    @Value("#{T(java.lang.Math).sqrt(144)}")
    int sqrt;
    @Value("#{T(java.lang.Math).PI}")
    double pi;
    @Value("#{T(bean.OtherSPEL).result()}")
    String r;

    public static void result() {
        System.out.println("Result");
    }
}
