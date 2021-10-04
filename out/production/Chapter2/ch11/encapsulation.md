## 캡슐화 encapsulation
1. 정보 은닉을 활용한 캡슐화
2. 꼭 필요한 정보와 기능만 외부에 오픈함
3. 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현하게 함
4. 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화한다.
5. 오류나 객체 업그레이드, 디버깅 등에 유연하다.

<hr/>

## String, StringBulider, StringBuffer의 차이점  
String은 새로운 값을 할당할 때마다 새로 생성된다.  
StringBulider와 StringBuffer는 memory에 값을 append한다.
### String의 특징
1. String은 새로운 값을 할당할 때마다 새로 생성된다.
2. String에 저장되는 문자열은, char의 배열형태로 저장된다.
3. String은 private이고, final char이다.

### StringBulider의 특징
1. StringBulider는 memory에 값을 append한다.
2. StringBulider는 Synchronization이 적용되지 않는다.
   1. Synchronization은 동기화가 되지 않는다는 뜻이다.
   2. 스레드들이 동시에 StringBulider클래스에 접근해서 값을 바꿀 수 있다.
   
### StringBuffer의 특징
1. StringBuffer는 memory에 값을 append한다.
2. StringBuffer는 Thread safety이다.
   1. Thread safety은 멀티 스레드 프로그래밍에서 일반적으로 어떤 함수나 변수, 혹은 객체가 여러 스레드로부터 동시에 접근이 이루어져도 프로그램의 실행에 문제가 없음을 뜻한다.
   2. 문자열을 변경가능하지만, multiple thread환경에서 안전한 클래스이다.
   3. 스레드들이 StringBuffer클래스에 접근을 해도 값을 바꿀 수 없다.

