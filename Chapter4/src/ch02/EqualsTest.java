package ch02;

public class EqualsTest {

    public static void main(String[] args) {

        Student std1 = new Student(100, "lee");
        Student std2 = new Student(100, "lee");

        // 1. equals()의 원래 정의는 주소값이 같냐는 것이다.
        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));
        // 그래서 이때 출력해주면 false 가 나온다.
//
        // 3. equals() 메소드를 강제 형변환해줬더니
        // equals() 메소드 출력 결과가 true 로 나왔다.

        // 4. hashCode() 메소드를 호출했을 때 나오는 결과
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
//        460141958
//        1163157884

//        String str1 = new String
    }


}
