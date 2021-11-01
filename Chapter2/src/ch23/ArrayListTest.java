package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {
    public static void main(String[] args) {

        // 1. 배열 개수
        // 기본이 10개, 필요하면 늘린다.
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        for (int i=0;i<library.size();i++){
            library.get(i).showInfo();
        }
    }
}
