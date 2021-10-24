package ch19;

public class Car {
    // 차 번호 (인스턴스 번호)
    int carNum;

    // 생성자
    // 매개변수가 차 번호
    // 차 번호를 set 해줌
    public Car(int carNum){
        this.carNum = carNum;
    }
    public int getCarNum(){
        return carNum;
    }
}
