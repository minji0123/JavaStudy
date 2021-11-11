package stringClass;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println("자바 프로그래밍 <- '프로그래밍' 글자 위치 : "+location);

        if (subject.indexOf("자바") != -1){
            System.out.println("자바와 관련된 책이다.");
        }
        else{
            System.out.println("자바와 관련없는 책이다.");
        }
    }
}
// indexOf(문자) 문자가 몇번째에 있는지 알려줌