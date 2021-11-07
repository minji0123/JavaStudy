package ch15.interfaceExtends;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        X xclass = myClass;
        xclass.x();
        //x 인터페이스 인스턴스는 x(); 밖에 호출못함

        System.out.println("--------------------------");
        Y yclass = myClass;
        yclass.y();
        //y 인터페이스 인스턴스는 y(); 밖에 호출못함

        System.out.println("--------------------------");
        MyClass iClass = myClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
        //MyClass 인스턴스는 전부 다 호출가능함

        System.out.println("--------------------------");
        MyInterface myInterface = myClass;
        myInterface.myMethod();
        myInterface.x();
        myInterface.y();
        //MyInterface 인스턴스는 전부 다 호출가능함
    }
}
