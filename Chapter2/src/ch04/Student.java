package ch04;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    Student(){

    }
    public Student(int studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public void showStudentInfo(){
        System.out.println( studentId + "학번 학생의 이름은 "+ studentName
                + " 이고, 주소는 " + address + "입니다.");
    }
    public String getStudentName(){
        return  this.studentName;
    }
    public void setStudentName(String name){

        studentName = name;
    }
}