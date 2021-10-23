package ch04;

public class StudentTest {
    public static void main(String[] args) {

        //Student타입인 studentLee 변수가 선언되었고, 이 변수가 힙 메모리에 할당되는데, println해보면 그 주소가 출력된다.
        Student studentLee = new Student();
        studentLee.studentId= 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();

        System.out.println(studentKim);
        System.out.println(studentLee);

        Student studentcons0 = new Student(1234,"민지","경기도 성남시");
        Student studentcons1 = new Student(1234,"민석","경기도 성남시");

    }
}
