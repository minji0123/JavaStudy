package ch12;

public class Person {
    String name;
    int age;

    public Person(){// 아무런 값이 안들어왔을 때는 초기화를 해주고 싶다.
        //int num = 10; 을 하면 오류가 난다. 생성자는 인스턴스를 초기화해주는 역할을 하기 때문에, this 다음에다가 적어줘야 오류가 안난다.
        this("no name",1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + ","+age);
    }

    public Person getPerson() { //반환 타입이 자기 자신(Person)
        return this;
    }


    // 1. 인스턴스 자신의 메모리를 가리킴
    public static void main(String[]args){
        Person person = new Person();
        person.showPerson();
        System.out.println(person);    // getPerson 출력 : ch12.Person@1b6d3586가 출력된다.

        //this 를 반환한 것이다.
        Person person2 = person.getPerson();
        System.out.println(person2); // 반환된 this 출력 : ch12.Person@1b6d3586가 출력된다.
    }

    // 2. 생성자에서 또 다른 생성자를 호출할 때 사용
    // 이걸 출력하면 no name, 1이 출력된다.
//    public static void main(String[]args){
//        Person person = new Person();
//        person.showPerson();
//    }// 이걸 출력하면 no name, 1이 출력된다.


}
