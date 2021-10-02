package ch07;

import java.sql.SQLOutput;

public class UserInfoTest {
    public static void main(String[] args) {

        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassWord = "123";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01000000000";
        userLee.userAddress = "Seoul";

        System.out.println(userLee.showUserinfo());

        UserInfo userKim = new UserInfo("a23456","1234","Kim");
        System.out.println(userKim.showUserinfo());
    }
}
