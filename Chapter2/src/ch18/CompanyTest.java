package ch18;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {


    // 1. new 없이 Company를 선언했다.
    // static은 클래스이름.으로 선언한다.
    Company company1 = Company.getInstance();
    Company company2 = Company.getInstance();

    // 2. private 생성자를 사용했다.
    // company1과 company2의 주소는 같다. 같은 주소를 가리킨다.
    System.out.println(company1);
    System.out.println(company2);

    // 3. 자바에서 제공하는 라이브러리 Calender
    Calendar calendar = Calendar.getInstance();


    }
}
