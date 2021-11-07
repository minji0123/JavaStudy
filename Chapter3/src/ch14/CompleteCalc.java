package ch14;

public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2==0){
            return ERROR;
        }
        return num1/num2;
    }

    // 형변환되는 경우, 인터페이스에서 선언된 메소드만을 사용가능함
   // 상속에서는 사용할 수 있었는디
    public void showInfo(){

        System.out.println("모두 구현했습니다.");
    }

    // 1. 인터페이스의 디폴트 메소드는 재정의할 수 있다.
    @Override
    public void description() { // 상위클래스인 Calc 메소드를 불러왔다.
        System.out.println("CompleteCalc overriding");
    }

}
