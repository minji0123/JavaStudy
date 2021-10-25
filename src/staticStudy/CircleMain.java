package staticStudy;

public class CircleMain {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.showCircleArea(2.0f);
        System.out.println("생성자에서 정적 선언 카운트 : "+Circle.staticMadeCount);
        System.out.println("생성자에서 일반 선언 카운트 : "+c1.getConstCount());
        System.out.println("메소드에서 일반 선언 카운트 : "+c1.getMethodCount());

        Circle c2 = new Circle(5.0f);
        c2.showCircleArea();
        System.out.println("생성자에서 정적 선언 카운트 : "+Circle.staticMadeCount);
        System.out.println("생성자에서 일반 선언 카운트 : "+c2.getConstCount());
        System.out.println("메소드에서 일반 선언 카운트 : "+c1.getMethodCount());

    }
}
// 일반 선언 카운트가 누적안되는이유는
// 생성자가 새로 만들어졌기 때문이다.