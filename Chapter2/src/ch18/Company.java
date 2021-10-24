// static 응용 - 싱글톤 패턴(singleton pattern)
// - 프로그램에서 인스턴스가 단 한개만 생성되어야 하는 경우 사용하는 디자인 패턴
// - static 변수, 메소드를 활용하여 구현할 수 있음
package ch18;

public class Company {

    // 1. 객체(필드)를 유일하게 만들어준다.
    private static Company instance = new Company();
    // 이렇게 두면 외부에서 접근할 수 없다.(사용할 수 없다.)


    // 2. '회사'라는 객체는 유일해야 한다. (지점은 여러 개 일 수 있다.)
    // 아무 것도 하지 않으면, 디폴트 생성자 때문에, Company를 여러 개 new 할 수 있게 된다.
    // 생성자에 private를 넣어주면 Company는 하나만 만들 수 있다.
    private Company(){
    }

    // 3. 외부에서 객체(필드)에 접근할 수 있게 만들어줌
//    public Company getInstance(){
//        // 3-1 혹시 몰라서 방어적인 코드(오류 예방차원)을 넣어줌
//        if(instance==null){
//            instance = new Company();
//        }
//        return instance;
//    }
    // 하지만 이렇게 생성하면 일반 메소드처럼, new를 통해 호출해야 하기 때문에
    // static을 넣어준다.

    // 4. new없이 외부에서 객체(필드)에 접근할 수 있게 만들어줌
    // 외부에서 이제 클래스 이름으로 접근할 수 있게 된다.
    public static Company getInstance(){
        // 4-1 혹시 몰라서 방어적인 코드(오류 예방차원)을 넣어줌
        if(instance==null){
            instance = new Company();
        }
        return instance;
    }

}
