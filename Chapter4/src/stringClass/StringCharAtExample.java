package stringClass;

public class StringCharAtExample {
    public static void main(String[] args) {
        // charAt(숫자) 숫자 위치의 문자가 뭔지 알려줌. 당연히 0부터 시작함

        String ssn= "010624-1230123"; // 주민번호구나... 충격
        char sex = ssn.charAt(7); // 7번째 문자좀 주셈
        System.out.println(sex);

        switch (sex){
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;

            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }

    }
}
