package ch09;

public class ComputerTest {
    public static void main(String[] args) {

        Computer deskTop1 = new DeskTop();

        // 추상클래스의 인스턴스를 생성하면 오류가 뜬다.
//        Computer computer = new Computer();

        DeskTop deskTop = new DeskTop();
//        deskTop1.display();

        NoteBook n1 = new MyNoteBook();
        n1.turnOn();
        n1.display();
        n1.typing();
        n1.turnOff();
    }
}
