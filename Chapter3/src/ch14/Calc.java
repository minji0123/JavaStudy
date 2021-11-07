package ch14;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    // 1. 디폴트 메소드
    // 이 인터페이스가 뭔지 적어주러고 만들었다.
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
    }

    // 2. static 메소드
    // 배열이 들어오면, 안에 들어있는 값의 총 합을 반환해주려고 만들었다.
    static int total(int[] arr) {
        int total = 0;
        for (int num : arr){
            total += num;
        }
        return total;
    }

}
