package constructor.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
    String name;
    String emailId;
    Address address;

    public Student() {
    }

    public Student(String name, String emailId, Address address) {
        this.name = name;
        this.emailId = emailId;
        this.address = address;
    }

    @Autowired
    public Student(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", address=" + address +
                '}';
    }
}
