package ch02;
class Outer2{

    // 원래 멤버변수는 생성자에서 선언하는게 좋다
    int outNum =100;
    static int sNum = 200;



    // Runnable 인터페이스 : 자바 lang패키지에 선언되는 인터페이스
    //                   : class를 스레드화 할 때 필요한 run 메소드를 구현할 때 사용하는 인터페이스
    Runnable getRunnable(int i){// 매개변수는 메소드가 호출될 때 생성이 된다. (스택메모리에 생성이된다)



        int num=10;



        // 1. 로컬이너클래스
        class MyRunable implements Runnable{ // Runnanle 인터페이스를 구현한 내부 클래스
            int localNum = 1000;


            // Runnable인터페이스가 제공하는 run메소드 오버라이딩
            @Override
            public void run() {
                // 값을 바꾸려고 하면 오류가 난다.
//                i=50;
//                num=20;
                outNum = 10;
                // getRunnable(int)메소드가 생성되는 시점이랑, MyRunable클래스가 생성되는 시점이 다르기 때문이다.
                // getRunnable(int)메소드 : 호출 시 변수는 스택에 메모리 생성, 메소드 호출이 끝나면 변수들은 없어진다.
                // MyRunable클래스의 run()메소드는 Outer2클래스의 getRunnable(int)를 받고 나면, 나중에 또 호출될 수 있다.
                // 나중에 호출되었는데, getRunnable(int)는 호출이 다 끝난 상황이면, 변수가 없기 때문에 오류가 난다.
                // 그래서 final로 처리한다. (컴파일러가 알아서 붙여준다.)

                // final 로 바꾸면 메소드 호출이 끝나도 변수가 안없어지고, 스택이 아니라 상수메모리에 잡힌다. 값을 바꿀 수 없다.
//                i=50;
//                num=20;
                localNum=30;
                System.out.println("i = "+i);
                System.out.println("num = "+num);
                System.out.println("localNum = "+localNum);

                System.out.println("outNum = " +outNum+"(외부클래스 인스턴스 변수");
                System.out.println("outer2.sNum = "+Outer2.sNum+"(외부클래스 정적 변수");
            }

        }
        return new MyRunable();



    }
}





public class AnonumousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();

    }
}
