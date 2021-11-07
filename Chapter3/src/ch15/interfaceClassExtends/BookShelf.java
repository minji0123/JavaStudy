package ch15.interfaceClassExtends;

public class BookShelf extends Shelf implements Queue{

    // 배열안의 값 _넣는 책 제목
    // add : 배열 안에다가 값 추가
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    // 배열안의 값 _꺼내는는 책 제목
    // remove : 배열 안에 있는 값 제거
    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    // 배열 크기 _책 몇권있는지
    @Override
    public int getSize() {
        return getCount();
    }
}
