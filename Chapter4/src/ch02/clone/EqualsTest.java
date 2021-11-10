package ch02.clone;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student std1 = new Student(100, "lee");
        Student std2 = new Student(100, "lee");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        // 6. clone() 은 인스턴스 상태를 복제할 때 사용한다.
        std1.setStudentName("kim");
            // 출력해보면은 100, kim 이 나옴


        // 2. clone() 의 리턴 타입은 Object 여서
            // Student 로 형변환 해주기
        Student copyStudent = (Student) std1.clone();
        System.out.println(copyStudent);
        // 3. 오류난거 throws 해줬는데도 오류 출력됨
            // cloneable 하다고 support 되지 않았다는 뜻임
//        Exception in thread "main" java.lang.CloneNotSupportedException: ch02.clone.Student
//        at java.lang.Object.clone(Native Method)

        // 4. server 클래스(Student) 가서 implements Cloneable 해주면 됨

    }

}
