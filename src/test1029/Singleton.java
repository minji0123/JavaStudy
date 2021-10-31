package test1029;

public class Singleton {

    public static void main(String[] args) {
        singleton.run(); // 변수 이름으로 메소드 호출
    }

    // private static으로 singleton 변수를 new해줌
    private static Singleton singleton = new Singleton();

    //생성자를 private으로 생성하기
    private Singleton(){}

    // Singleton 변수를 return 해주는 게터메소드를 static으로 생성
    public static Singleton getInstance(){
        return Singleton.singleton;
    }

    void run(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("(s1 == s2) ? " + (s1 == s2));
    }
}
