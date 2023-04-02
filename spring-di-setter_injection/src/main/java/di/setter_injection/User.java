package di.setter_injection;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    int userid;
    String userName;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        System.out.println("Using setter injection for id");
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("Using setter injection for name");
        this.userName = userName;
    }
}
