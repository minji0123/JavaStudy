package ch15.interfaceExtends;

public class MyClass implements MyInterface{

    // 여기서 구현함
    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }
}
