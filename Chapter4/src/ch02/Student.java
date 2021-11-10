package ch02;

public class Student {
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    // toString()메소드
//    public String toString(){
//        return studentNum + "," + studentName;
//    }

    // equals()메소드
    // 2. 강제 형변환으로 Object 클래스를 Student 클래스로 다운캐스팅한다.
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student){ // 만약에 얘네 둘이 상속관계면은
            Student std = (Student) obj; // 다운캐스팅ㄱㄱ
            if (this.studentNum == std.studentNum){
                // 여기 클래스에있는 멤버변수랑 다운캐스팅 된 애가 가리키는 주소가 같으면은
                return true; // ㅇㅋ하셈 (어차피 주소가 같으면 값도 같으니까)
            }
            else {return false;} // 아니면 ㄴㄴ
        }
        return false;
    }

    // 8. 그래서 보통 이 해시코드를 이용해서 값을 출력함
    @Override
    public int hashCode() {
//        return super.hashCode();
        return studentNum;
        // 학번을 반환해줘버림
        // 그럼 해시코드는 학번이 되어버림
    }

}
