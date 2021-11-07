package ch02;
class Outer3{

    // 원래 멤버변수는 생성자에서 선언하는게 좋다
    int outNum =100;
    static int sNum = 200;


    Runnable getRunnable(final int i){// 매개변수는 메소드가 호출될 때 생성이 된다. (스택메모리에 생성이된다)

        final int num=10;

        // 1. 어나미머스이너클래스
        // 그럼 어차피 상수니까, 이름설정하지 말아버리자
        return new Runnable(){
            int localNum = 1000;

            @Override
            public void run() {
                System.out.println("i = "+i);
                System.out.println("num = "+num);
                System.out.println("localNum = "+localNum);

                System.out.println("outNum = " +outNum+"(외부클래스 인스턴스 변수");
                System.out.println("outer2.sNum = "+Outer2.sNum+"(외부클래스 정적 변수");
            }

        };

    }
    // 2. 어나미머스 이렇게도 생성할 수 있다.
     Runnable runnable = new Runnable() {
         @Override
         public void run() {
             System.out.println("Runnable class");
         }
     };
}


public class AnonumousInnerTestReturn {
    public static void main(String[] args) {
        Outer3 out = new Outer3();
        Runnable runner = out.getRunnable(100);

        runner.run();
        out.runnable.run();
    }
}
