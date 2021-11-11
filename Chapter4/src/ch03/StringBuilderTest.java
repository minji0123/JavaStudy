package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {

        // 2. StringBulider, StringBuffer
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java); // buffer 라는 변수에 매개값 java 넣어서 만들고
               System.out.println(" [buffer] append 전 : " + System.identityHashCode(buffer)); // 해시코드 한번 찍어보셈
        buffer.append(android); // android 랑 이어붙이고
                System.out.println(" [buffer] append 후 : " + System.identityHashCode(buffer));
//                 [buffer] append 전 : 460141958
//                 [buffer] append 후 : 460141958
                    // 똑같음ㅋ

        String test = buffer.toString(); // toString() 으로 출력
        System.out.println(test);



    }
}
