package methodStudy;

import java.util.Arrays;
public class FunTestStudyMain {
    public static void main(String[] args) {

        // 인스턴스 생성
        FunTestStudy test1 = new FunTestStudy();

        System.out.println("-----------------------------------------------");
        // 반환값이 없음
        // 매개변수 없고, 반환값이 없음
        System.out.println("[매개변수 없고, 반환값이 없음]");
        test1.sayHi1();
        // 매개변수 있고, 반환값이 없음
        System.out.println("[매개변수 있고, 반환값이 없음]");
        test1.sayHi2("안녕하세요");
        System.out.println("-----------------------------------------------");



        // 반환값이 있음
        // 매개변수 없고, 반환값이 있음
        System.out.println("[매개변수 없고, 반환값이 있음]");
        int result100=0;
        result100 = test1.addNum100();
        System.out.println("1부터 100까지의 합 : " + result100);
        // 매개변수 있고, 반환값이 있음
        System.out.println("[매개변수 있고, 반환값이 있음]");
        int resultXY=0;
        resultXY = test1.addNumXY(10, 10);
        System.out.println("x와 y의 합 : "+resultXY);
        System.out.println("-----------------------------------------------");



        // 배열 출력
        // 매개변수가 참조변수(배열), 반환값 없음
        // return에 출력기능을 넣지 않음
        System.out.println("[매개변수가 참조변수(배열), 반환값 없음]");
        int wantAdd10[] = {1,2,3,4,5};
        test1.updateArray10(wantAdd10);
        System.out.println(Arrays.toString(wantAdd10));

        // 매개변수가 참조변수(배열), 반환값 있음
        System.out.println("[매개변수가 참조변수(배열), 반환값 있음]");
        int wantAdd20[] = {1,2,3,4,5};
        test1.updateArray20(wantAdd20);
        System.out.println(Arrays.toString(wantAdd20));

        // 매개변수가 기본변수(값), 반환값 없음
        System.out.println("[매개변수가 기본변수(값), 반환값 없음]");
        int num5 = 5;
        test1.makeArrayY(num5);

        // 매개변수가 기본변수(값), 반환값 있음
        System.out.println("[매개변수가 기본변수(값), 반환값 있음]");
        int num10 = 10;
        int wantAddNum10[]=test1.makeArrayX(num10);
        System.out.println(Arrays.toString(wantAddNum10));

        // 매개변수가 가변인수, 반환값 없음
        System.out.println("[매개변수가 가변인수, 반환값 없음]");
        test1.argChangeArrayX();
        test1.argChangeArrayX(1);
        test1.argChangeArrayX(1,2);

        // 매개변수가 가변인수, 반환값 있음
        System.out.println("[매개변수가 가변인수, 반환값 있음]");
        System.out.println(Arrays.toString(test1.argChangeArrayY1(1)));
        System.out.println(Arrays.toString(test1.argChangeArrayY1(1,2,3)));

        // 매개변수가 기본변수와 가변인수, 반환값 있음
        System.out.println("[매개변수가 기본변수와 가변인수, 반환값 있음]");
        System.out.println(Arrays.toString(test1.argChangeArrayY(1,2)));
        System.out.println(Arrays.toString(test1.argChangeArrayY(1,2,3)));
        System.out.println("-----------------------------------------------");
    }
}
