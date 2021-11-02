##[인터페이스]
0. {}가 없는 클래스
    - {} : 구현코드

1. 모든 메서드가 추상 메서드로 선언됨
    - public abstract
    - 직접 abstract 연산자를 적지 않아도 컴파일러가 자동으로 넣어줌

2. 모든 변수가 상수로 선언됨
    - public static final
    - 직접 static final 연산자를 적지 않아도 컴파일러가 자동으로 넣어줌

3. 자바 8 부터 디폴트 메서드(default method)와 정적 메소드(static method) 기능의 제공으로, 일부 구현 코드가 있음

4. Class 대신 interface 를 사용


##[인터페이스 정의와 구현]   
![Alt text](C:/Users/user/Desktop/javaGit/interface.jpg)
1. Calc : interface // Calculator : abstract Class // CompleteCalc : Class

2. 상속관계를 표현함
    - 화살표가 점선이다.

3. 코드가 완성되면 맨 아래 자식 CompleteCalc 클래스가 인스턴스화됨

4. 구현상속
    - CompleteCalc는 Calculator를 상속받았다.

5. 타입상속
    - CompleteCalc는 Calc를 상속을 받은거는 아니지만, Calc타입이 구현되어있다.
6. 다중상속
    - CompleteCalc는 interface의 다중 상속이 가능하다.