package ch10;

public class BirthDayTest {
    public static void main(String[] args) {

        BirthDay date = new BirthDay();
        date.setYear(2019);
        date.setMonth(12);
        date.setDay(31);
        date.showDate();

        //date.month = 100; // private가 없으면 이렇게 외부 class에서 값을 바꿔버릴 수가 있다.
    }
}
