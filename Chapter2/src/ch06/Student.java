package ch06;

public class Student{

    public int studentNumber;
    public String studentName;
    public int grade;

//    public void setStudentNumber(int a) {
//        this.studentNumber = a;
//    }
//    public int getStudentNumber() {
//        return studentNumber;
//    }



    // 맴버 변수는 만들어지면 자동으로 초기화된다.
    // String은 null로 초기화, int 는 0으로 초기화

//    public Student( ){//생성자이다.
//        System.out.println("Student 생성");
//    }
    public Student() {}

    public Student(int studentNumber, String studentName, int grade){//생성자이다.
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo(){
        return studentName + "학생의 학번은" + studentNumber + "이고, "+ grade + "학년 입니다.";
//        return studentName + "학생의 학번은" + studentNumber + "이고, "+ grade + "학년 입니다."+i;
        // i는 이 지역에서만 사용하는 지역변수이고, 만들어지면 자동으로 초기화가 되지 않는다.
        // 맴버변수와 지역변수는 완전 다른 타입의 변수인 것이다.
    }
}
