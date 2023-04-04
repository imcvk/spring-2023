package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class User {
    int userid;
    String userName;
@Autowired
        @Qualifier("address2")
    Address address;

    public User() {
    }

    public User(int userid, String userName, Address address) {
        this.userid = userid;
        this.userName = userName;
        this.address = address;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", address=" + address +
                '}';
    }
}
