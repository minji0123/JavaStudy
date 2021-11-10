package ch02;

public class EqualsTest {

    public static void main(String[] args) {

        Student std1 = new Student(100, "lee");
        Student std2 = new Student(100, "lee");

        // 1. equals()의 원래 정의는 주소값이 같냐는 것이다.
        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));
        // 그래서 이때 출력해주면 false 가 나옴 (지금은 오버라이딩한상태여서 true 일거임. 블록처리하셈)
//
        // 3. equals() 메소드를 강제 형변환해줬더니
        // equals() 메소드 출력 결과가 true 로 나왔음

        // 4. hashCode() 메소드를 호출했을 때 나오는 결과
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
//        460141958
//        1163157884

        // 9. hashCode() 학번으로 바꿔버려서 100이 출력됨
        // 근데 나는 바뀐 100 말고 원래 hashCode() 알고싶음
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));
//        460141958
//        1163157884
        // 다시 원래의 hashCode() 값이 나온다.


        // (얜 String 클래스임)
        // 5. 강제형변환하고 인스턴스 생성함
        String str1 = new String("abc");
        String str2 = new String("abc");

        // 6. equals() 결과가 true로 나옴.
        // 7. hashCode() 결과도 같게 나옴
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
//        96354
//        96354


        // Integer 의 hashCode() 를 찍으면 그대로 값이 나온다.
//        Integer i = 100;
//        System.out.println(i.hashCode());
//        // 100
    }


}
