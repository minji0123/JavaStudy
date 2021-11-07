package ch15.interfaceClassExtends;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        // 책장안에 책 넣기
        bookQueue.enQueue("토지1");
        bookQueue.enQueue("토지2");
        bookQueue.enQueue("토지3");
        bookQueue.enQueue("토지4");
        bookQueue.enQueue("토지5");

        // 책장안에 꽃혀있는 책 개수
        System.out.println("책 개수 : " +bookQueue.getSize());

        //한권씩 꺼내보기
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());



    }
}
