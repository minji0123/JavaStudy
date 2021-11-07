package ch15.interfaceClassExtends;

public interface Queue {
    // 넣는 책
    void enQueue(String title);

    // 꺼내는 책
    String deQueue();

    // 몇개가 있느냐
    int getSize();
}
