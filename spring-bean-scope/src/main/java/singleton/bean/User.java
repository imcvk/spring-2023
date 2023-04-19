package singleton.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Value("abc")
    String username;
    @Value("abc@gmail.com")
    String emailId;

}
