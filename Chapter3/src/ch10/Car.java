package ch10;
// 추상 상위 클래스에서 전체적인 흐름 정함

public abstract class Car {

    // 1. (구현안된) 추상 메소드
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    // 2. (구현된) 메소드
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    // 3. (구현된) 훅 메소드
    // 얘는 구현된 메소드이지만, 구현 내용이 없다.
    // 필요한 경우에 자식클래스에서 재정의할 때 사용한다.
    public void washCar(){}


    // 이 메소드들은 변하면 안되기 때문에, final 로 정의한다.
    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
