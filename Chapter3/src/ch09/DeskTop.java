package ch09;

public class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("화면이 켜집니다.");
    }

    @Override
    public void typing() {
        System.out.println("화면에 글자가 출력됩니다.");
    }

    @Override
    public void turnOff() {
//        super.turnOff();
        System.out.println("화면이 꺼집니다.");
    }
}
