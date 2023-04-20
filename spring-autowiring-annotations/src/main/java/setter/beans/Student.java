package setter.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    String name;
    String emailId;
    @Autowired
    Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
}
