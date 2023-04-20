package beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    String name;
    @Autowired
    Address address;
}
