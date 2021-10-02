package ch07;

public class UserInfo {
    public String userId;
    public String userPassWord;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo(){}

//    public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
//        this.userId = userId;
//        this.userPassWord = userPassWord;
//        this.userName = userName;
//        this.userAddress = userAddress;
//        this.phoneNumber = phoneNumber;
//    }

    public UserInfo(String userId, String userPassWord, String userName){
        this.userId = userId;
        this.userPassWord = userPassWord;
        this.userName = userName;
    }

    public String showUserinfo(){
        return "고객님의 아이디는 " + userId + " 이고, 등록된 이름은 " + userName + " 입니다.";
    }
}
