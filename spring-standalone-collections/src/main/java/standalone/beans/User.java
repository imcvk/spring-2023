package standalone.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
    List<String> addresses;
    Map<String,String> phoneNo;
    Set<String> courses;

    public User() {
    }

    public User(List<String> addresses, Map<String, String> phoneNo, Set<String> courses) {
        this.addresses = addresses;
        this.phoneNo = phoneNo;
        this.courses = courses;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Map<String, String> phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "User{" +
                "addresses=" + addresses +
                ", phoneNo=" + phoneNo +
                ", courses=" + courses +
                '}';
    }
}
