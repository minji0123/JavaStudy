package ch03;

public class StringTest {
    public static void main(String[] args) {
        // 1. String 이 불변 final 이라고 말한 이유
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1==str2);
        // 얘는 힙메모리에 따로 잡히는거고

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3=str4);
        // 애는 상수풀에 있는 애를 가리키는 거고, 같은 주소값이다.
        System.out.println();

        /*
        한번 생성된 String 은 불변임
        그래서 String 끼리 연결하면 (+) 새로운 문자열이 생성되는거임. 기존에 있던애들이 연결되는게 아니라
        그래서 메모리 낭비가 발생한다고 한거
         */

        /*
        그리고 String 까보면은 final 로 선언되어있음
        한번 String 선언되면은 값이 안바뀐다는거임  -> 오류가 나는게 아니라, 원본은 그대로 남아있고, 복제본이 생겨서 그 값이 바뀜.
             메모리 낭비 엄청되는거
         */

        // 2. StringBulider, StringBuffer 사용하는 이유
        String java = new String("java");
        String android = new String("java");
        System.out.println(System.identityHashCode(java)); // java 인스턴스 해시코드 : 460141958
        System.out.println(java.hashCode());
                // java.hashCode() 로 하면 오버라이딩된 해시코드 나옴 : 3254818

        java = java.concat(android); // 두개 이어붙여서 java 인스턴스에 넣어줌

        System.out.print(java); // : javajava
        System.out.println(System.identityHashCode(java)); //1163157884

        // 해시코드가 다르다?? -> 다른주소를 가리킨다 -> 다른 객체이다.
        // 근데 String 을 이렇게 이어붙이면 다른 해시코드가 나온다?? -> 다른 객체가 계속 생성된다 -> 메모리낭비다
    }
}
