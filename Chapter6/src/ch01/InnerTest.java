package ch01;

class OutClass{

    //======외부클래스=====
    // 1. 외부 클래스에서는 private, static변수 모두 선언 가능
    private int num = 10;
    private static int sNum = 20;

    // 인스턴스 이너클래스는 언제 생성이 되냐면 아우터클래스가 먼저 생성되고 난 다음에 생성되여
    // 2-1 그래서 주로 어떻게 쓰나면
    // 내부클래스의 변수를 생성한다음, 외부클래스의 생성자 안에다가 넣어준다.
    private InClass inClass;
    public OutClass (){
        inClass = new InClass();
    }


    //======내부클래스=====
    // 보통 내부클래스는 private를 선언한다.
    // 밖에서 호출할 일이 없기 때문이다.
    class InClass{
        // 2. 내부 클래스에서는 static변수 선언 불가능
        int iNum = 100;
//        static int sInNum = 500;
        // 인스턴스 이너클래스는 언제 생성이 되냐면 아우터클래스가 먼저 생성되고 난 다음에 생성이 되는데,
        // 근데 static 변수는 아우터클래스 생성과 상관없이 쓸 수 있는 변수니까, 이너클래스 내부에서는 정적 변수를 사용할 수 없다.
        // 정적 변수를 사용하고 싶으면, 정적 내부클래스에서 사용해야 한다.

        void inTest() {
            System.out.println("외부클래스  num = " + num + "(외부클래스의 인스턴스 변수");
            System.out.println("외부클래스 sNum = " + sNum + "(외부클래스의  스태틱 변수");
            System.out.println("내부클래스 iNum = " + iNum + "(내부클래스의 인스턴스 변수");
        }
    }

    public void usingClass(){
        // 3. 외부 클래스의 메소드에서 내부클래스 메소드를 사용 가능
        inClass.inTest();
    }


    // =====정적 내부 클래스=====
   static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
//            System.out.println("외부클래스  num = " + num + "(외부클래스의 인스턴스 변수");
            System.out.println("외부클래스 sNum = " + sNum + "(외부클래스의  스태틱 변수");
            System.out.println("정적내부클래스 iNum = " + iNum + "(정적내부클래스의 인스턴스 변수");
            System.out.println("정적내부클래스 sInNum = " + sInNum + "(정적내부클래스의 스태틱 변수");
            // 외부클래스의 인스턴스 변수에 오류가 났다.
            // 정적 내부클래스는 외부클래스 생성과 상관없이 생성될 수 있기 때문에
            // 외부클래스의 변수를 사용할 수 없다.
        }

        static void sTest(){
//            System.out.println("외부클래스  num = " + num + "(외부클래스의 인스턴스 변수");
            System.out.println("외부클래스 sNum = " + sNum + "(외부클래스의  스태틱 변수");
//            System.out.println("정적내부클래스 iNum = " + iNum + "(정적내부클래스의 인스턴스 변수");
            System.out.println("정적내부클래스 sInNum = " + sInNum + "(정적내부클래스의 스태틱 변수");
            // 마찬가지로 정적내부메소드 또한 조건없이 생성될 수 있기 때문에
            // 정적변수 말고는 사용할 수 없다.
        }
    }
}


public class InnerTest {
    public static void main(String[] args) {

        // 4. 외부클래스 인스턴스 생성
        OutClass outClass = new OutClass();
            // 4-1 외부클래스의 외부메소드 호출
        outClass.usingClass();


        // 5. 내부클래스 인스턴스 생성
        // 원래 내부클래스는 인스턴스 생성을 하지 않는데, 이론상 가능하다.
        OutClass.InClass inner = outClass.new InClass();
            // 5-1 내부클래스의 내부메소드 호출
        inner.inTest();

        // 6. 정적내부클래스 인스턴스 생성
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        // 7. 정적내부메소드 호출
        OutClass.InStaticClass.sTest();
        // 인스턴스 생성 없이 바로 호출 가능
    }

}
