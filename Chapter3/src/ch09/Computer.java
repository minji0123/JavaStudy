package ch09;

public abstract class Computer { // 추상 클래스

    public abstract void display(); // 선언. 추상 메서드
    public abstract void typing(); // 선언. 추상 메서드

    public void turnOn(){ // 구현부가 있음. 추상 메서드 아님
        System.out.println("컴퓨터 전원을 켭니다.");
    }

    public void turnOff(){ // 구현부가 있음. 추상 메서드 아님
        System.out.println("컴퓨터 전원을 끕니다.");
    }

}
