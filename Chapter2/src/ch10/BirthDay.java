package ch10;

public class BirthDay {

    private int day;
    private int month;
    private int year;
    //int day;
    //int month;
    //int year;

    //날짜 형식이 맞는지 아닌지 체크하기 위해 넣은 변수. 굳이 공개하지 않아도 되므로 private로 해준다.
    private boolean isValid; //얘는 참거짓만 표시해준다. 기본값은 false이다.

    public boolean getIsValid(){
        return isValid;
    }//이렇게 하면 읽을 수는 있다. 하지만 굳이 안그래도 된다.

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    // 정보 은닉
    public void setMonth(int month) {
        if (month<1 || month >12){
            isValid = false;
        }
        else{
            isValid = true;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
        }
        else {
            System.out.println("유효하지 않은 날짜");
        }
    }


}