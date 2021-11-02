package ch08;

import java.util.ArrayList;

// 0. 부모클래스
class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
    public  void eating(){}
}

// 0. 자식클래스
// 1. 상속
class Human extends Animal{
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
        // 3. 형변환 [부모 변수 = new 자식();]
        Animal hAnimal = new Human(); // hAnimal의 데이터 타입은 Animal
        Animal tAnimal = new Tiger(); // tAnimal의 데이터 타입은 Animal
        Animal eAnimal = new Eagle(); // tAnimal의 데이터 타입은 Animal

        // 4. AnimalTest 로 인스턴스 생성
        AnimalTest test = new AnimalTest();

        // 4. arraylist
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        System.out.println("[다형성]");
        for(Animal animal : animalList){
            animal.move();
        }
        System.out.println("[다운캐스팅]");
        test.testDownCasting(animalList);
    }


    // 5-1 하위클래스만의 메소드는 호출할 수 없다.
    // 하고싶으면, 다운캐스팅을 해야 한다.
    // 다운캐스팅과 if+instanceof
    public void testDownCasting(ArrayList<Animal> list){
        for (int i=0; i<list.size(); i++){
            Animal animal = list.get(i);
            if (animal instanceof Human){ // instanceof
                Human human = (Human) animal; // 다운캐스팅
                human.readBook();  // 하위클래스만의 메소드 호출
            }
            else if (animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if (animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
            else {
                System.out.println("unsupported type");
            }

        }
    }
}
