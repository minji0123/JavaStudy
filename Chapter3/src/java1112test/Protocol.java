package java1112test;

public interface Protocol {

    // 1. 상수 필드
    double PI = 3.14;

    // 2. 추상 메소드
    int circleArea(int num1);

    // 3. 디폴트 메소드
    default void description(){
        System.out.println("원 넓이를 계산합니다.");
    }

    // 4. 정적 메소드
    static void total(){
        System.out.println("정적메소드");
    }
}
