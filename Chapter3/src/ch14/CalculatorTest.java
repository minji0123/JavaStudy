package ch14;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.subtract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));
//        System.out.println(calc.showInfo());
        CompleteCalc completeCalc = new CompleteCalc();
        completeCalc.showInfo();


        // 1. 인터페이스의 디폴트 메소드를 잘 호출한다.
        calc.description();

        // 2. 인터페이스의 정적 메소드를 잘 호출한다.
        // 인터페이스의 정적 메소드는 인스턴스 생성과 무관하게 호출할 수 있기 때문에, 윗부분을 전부 주석처리해도 호출가능하다.
        int[]arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));

    }
}
