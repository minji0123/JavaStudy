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
    //이렇게 클래스로 정의한 변수는 반드시 new로 생성자 처리를 해줘야 한다.

    Student(int studentId, String StudentName){
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
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


    }

}