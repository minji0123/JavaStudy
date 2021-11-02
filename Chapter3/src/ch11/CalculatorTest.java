package ch11;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        // 1. 형변환
        // 부모클래스가 데이터타입이기 때문에
        // 자식클래스인 showInfo메소드를 사용할 수 없다.
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.subtract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));

        // 얘는 형변한하지 않았기 때문에
        // 자신의 메소드를 사용할 수 있다.
        CompleteCalc calc1 = new CompleteCalc();
        calc1.showInfo();
    }
}
