package ch01;

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("어린왕자","생택쥐폐리");
        System.out.println(book);
        // ch01.Book@1b6d3586 주소값은 16진수이다.



        String str = new String("book");
        System.out.println(str);
        // book
        // 주소값이 안나오고, 넣어준 값이 출력되는 이유는
        // .toString()이 오버라이딩 되어서 그렇다. (이미 재정의가 되어 있다.)

        System.out.println(book);
        // 어린왕자,생택쥐폐리
        // Book 클래스에서 toString() 오버라이딩 해줬더니, 오버라이딩 해준 값이 나왔다.




    }
}
