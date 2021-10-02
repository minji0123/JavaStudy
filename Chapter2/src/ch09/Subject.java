//참조 자료형 변수
package ch09;

public class Subject {
    String subjectName;
    int score;
    int subjectId;
}

class Student{
    int studentId;
    String studentName;
    Subject korea;
    Subject math;
    // 이렇게 클래스로 정의한 변수는 반드시 new 로 생성자 처리를 해줘야 한다.

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        korea = new Subject();
        math = new Subject();
        // 이렇게 해줘야 한다.
    }

    public void setKoreaSubject( String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }
    public void setMathSubject( String name, int score){
        math.subjectName = name;
        math.score = score;
    }
    public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total +" 점 입니다.");
    }
}
class SubjectTest {
    public static void main(String[]args){
        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 100);

        Student studentKim = new Student(100, "Kim");
        studentKim.setKoreaSubject("국어", 50);
        studentKim.setMathSubject("수학", 60);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}