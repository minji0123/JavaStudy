package practice;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Tiger();
        Tiger a3 = new Tiger();

        // 1. 데이터 타입
        a1.animalKind();
        a1.move();

        a2.animalKind();
        a2.move();

        a3.tigerHunt();
        a3.animalKind();
        a3.move();


        // 2. 메소드
        a1.move(); // 사람은 움직인다.
        a2.move(); // 호랑이는 움직인다.
        a3.move(); // 호랑이는 움직인다.



    }
}
