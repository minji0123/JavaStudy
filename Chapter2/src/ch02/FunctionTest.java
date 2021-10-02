package ch02;

public class FunctionTest {

    public static void sayHello(String greeting){
        System.out.println(greeting);
    }
    public static int calcSum(){
        int sum = 0;
        int i;
        for (i=0; i<=100; i++){
            sum+=i;
        }
        return sum;
    }
    public static int addNum(int num1, int num2){
// 반환해 줄 데이터 타입은 int이고, 메서드 이름은 addNum이다. 두 개의 매개변수를 받았다.
        int result;
        result = num1+num2;
        return result;
    }
    public static void main(String[] args) {

        int n1=10;
        int n2=20;

        int total = addNum(n1,n2);
        System.out.println(total);

        sayHello("안녕하세요");
        total = calcSum();
        System.out.println(total);
    }
}
