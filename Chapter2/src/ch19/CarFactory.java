/*
자동차 공장 생성
자동차 공장은 유일한 객체
공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됨
자동차 번호는 10001부터 시작되고, 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙음
 */
package ch19;

public class CarFactory {

    // 외부에서 자동차 공장 객체에 접근할 수 없게 private을 해줌
    // static은 공유하려고 쓴거고
    // 여기서 new를 해줘서 유일한 객체를 만들었음. 참조니까 무조건 한 방향만 가리킴
    private static CarFactory carFactory = new CarFactory();

    // 차 번호라는 공유변수 생성
    private static int carNum = 10000;

    // 자동차 공장은 유일한 객체
    // 디폴트 생성자가 아닌걸 하나 만들어줬음
    private CarFactory(){
    }

    // CarFactory를 외부에서 읽을 수 있게 해줌 (게터 해줌)
    public static CarFactory getInstance(){
        return carFactory;
    }



    // Car 클래스에서 new Car해줌
    // new해줘서 인스턴스(차) 생성할 수 있게 해줌
    // 인스턴스(차) 생성할 때 마다 carNum이 증가한다.
    public Car createCar(){
        carNum++;
        return new Car(carNum);
    }





}
