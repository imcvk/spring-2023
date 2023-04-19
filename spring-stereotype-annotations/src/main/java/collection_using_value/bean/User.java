package collection_using_value.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Value("abc")
    String username;
    @Value("abc@gmail.com")
    String emailId;
    @Value("#{phonenumbers}")
    List<String> phoneNumbers;
    @Value("#{addresses}")
    Set<String> addresses;
    @Value("#{projects}")
    Map<String,String> projects;
}
