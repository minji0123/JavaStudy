package ch02.clone;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    // 5. 이름 studentName 를 바꿔주려고 만든 메소드
    public void setStudentName(String name){
        this.studentName = name;
    }

    public String toString(){
        return studentNum + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student){
            Student std = (Student) obj;
            if (this.studentNum == std.studentNum){

                return true;
            }
            else {return false;}
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;

    }
    // 1. clone() 오버라이드
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
