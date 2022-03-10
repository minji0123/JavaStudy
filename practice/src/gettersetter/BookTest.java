package gettersetter;

public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book();

        Book book2 = new Book("부동산경매", "생택쥐페리");

        book2.setTitle("어린왕자");
        System.out.println(book2.getTitle()+book2.getAuthor());
    }
}

