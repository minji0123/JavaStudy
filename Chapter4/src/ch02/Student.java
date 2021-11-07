package ch02;

public class Student {
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    // 2. 강제 형변환으로 Object 클래스를 Student 클래스로 다운캐스팅한다.
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
        return super.hashCode();
    }

//    public String toString(){
//        return studentNum + "," + studentName;
//    }

}
