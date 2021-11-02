package ch06;

import java.util.ArrayList;

// 0. 부모클래스
class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
    // 0. 나중에 추상클래스에서도 다룸
    //  공통적으로 쓰일 수가 있는 메소드가 있으면
    // 그냥 상위클래스에다가 적어주자
    public  void eating(){ }
}

// 0. 자식클래스
// 1. 상속
class Human extends Animal{
    // 2. 메소드 재정의
    @Override
    public void move() {
        System.out.println("사람이 두 발로 움직입니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 움직입니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아다닙니다.");
    }
    public void flying(){
        System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        // 3. 형변환
        // 부모 변수 = new 자식();
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        // 4. main 메소드의 클래스로 인스턴스 생성성
       AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal); // 부모꺼 메소드 사용가능 --> 형변환했기 때문이당
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        // 4-1 arraylist로 출력해보기
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList){
            animal.move();
        }
    }
    
    // 0. moveAnimal()메소드는 AnimalTest 클래스의 것이다.
    public void moveAnimal(Animal animal){
        // 5. 다형성!
        // 코드는 한 줄인데, 여러 출력결과가 나왔다
        animal.move();

        // 5-1 하위클래스만의 메소드는 호출할 수 없다.
        // 하고싶으면, 다운캐스팅을 해야 한다.
    }
}
/*
1. 다형성의 과정
상속 --> 자식메소드 move가 재정의됨 --> 형변환이 일어남(부모클래스로)
상속을 하게 되면, 하위클래스들을 상위클래스 하나의 타입으로 모두 핸들링 할 수 있다.
    --> 클래스 간의 결합도가 굉장히 타이트해진다.
    --> 상위클래스를 바꾸면, 하위클래스도 영항을 받게 된다.
 */