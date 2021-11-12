package java1112test;

public class ProtocolRun {
    public static void main(String[] args) {
        int radius = 10;

        Protocol protocol = new ProtocolImpl();
        int area = protocol.circleArea(radius);

        protocol.description();
        System.out.println("원 반지름: " +radius + ", 원넓이 : "+area);

    }
}
