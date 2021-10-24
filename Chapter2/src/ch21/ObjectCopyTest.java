package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];


        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library,0,copyLibrary,0,5);


        System.out.println("----------library----------");
        for(Book book : library){

            System.out.println(book);
            book.showInfo();
        }

        System.out.println("----------copy library----------");
        for(Book book : copyLibrary){

            System.out.println(book);
            book.showInfo();
        }
        // 주소까지 같이 카피됨.
        // 카피된 배열이 원본 배열과 같은 방향을 가리킴

        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        System.out.println("----------바뀐 library----------");
        for(Book book : library){

            System.out.println(book);
            book.showInfo();
        }

        System.out.println("----------바뀐 copy library----------");
        for(Book book : copyLibrary){

            System.out.println(book);
            book.showInfo();
        }
        // 카피된 배열이 원본 배열과 같은 방향을 가리키기 때문에
        // 원본 값이 바뀌면 카피된 배열도 같이 값이 바뀜



    }
}
