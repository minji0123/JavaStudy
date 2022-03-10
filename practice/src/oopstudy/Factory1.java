package oopstudy;

import java.net.SocketOption;

public class Factory1 {
    public int carNum;
    public String carName;
    public int carGrade;

//    public void setCarNum(int a){
//        this.carNum = a;
//    }
//    public int getCarNum(){
//        return carNum;
//    }

    public String showCarInfo(){
        return carNum + "의 이름은 " + carName + "이고, " +carGrade + "등급 이다.";
    }//이렇게 하면 값을 받아와서 설정하지 못한다.

    public Factory1(int carNum, String carName, int carGrade){
        //생성자이다.
        //get,set 을 동시에 해준다.
        this.carNum = carNum;
        this.carName = carName;
        this.carGrade = carGrade;
    }
    public Factory1(){
        System.out.println("자동차 생성");

    }
}
