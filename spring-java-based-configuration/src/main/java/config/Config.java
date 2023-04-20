package config;

import beans.Address;
import beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student getStudent() {
        return new Student();
    }
    @Bean
    public Address getAddress(){
        return new Address();
    }
}
