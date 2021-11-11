package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args)throws ClassNotFoundException{

        Class c = Class.forName("java.lang.String");

        // Class 변수 c 가 갖고 있는 생성자랑 메서드들 살펴보쟈
        Constructor[] cons = c.getConstructors();
            // getConstructors() 는 배열로 반환됨
            // 그리고 이 메소드는 reflect 에 들어있음

//        for (Constructor co : cons){
//            System.out.println(co);
//        }
        // 안에 어떤 생성자들이 있나 출력해봄
//        public java.lang.String(byte[],int,int)
//        public java.lang.String(byte[],java.nio.charset.Charset)
//        public java.lang.String(byte[],java.lang.String) throws java.io.UnsupportedEncodingException
//        public java.lang.String(byte[],int,int,java.nio.charset.Charset)
//        public java.lang.String(byte[],int,int,java.lang.String) throws java.io.UnsupportedEncodingException
//        public java.lang.String(java.lang.StringBuilder)
//        public java.lang.String(java.lang.StringBuffer)
//        public java.lang.String(byte[])
//        public java.lang.String(int[],int,int)
//        public java.lang.String()
//        public java.lang.String(char[])
//        public java.lang.String(java.lang.String)
//        public java.lang.String(char[],int,int)
//        public java.lang.String(byte[],int)
//        public java.lang.String(byte[],int,int,int)

        // 메소드도 출력해봄
        Method[] met = c.getMethods();
        for (Method m : met){
            System.out.println(m);
        }
        // 출력했는데 결과가 너무많아서 pass



    }

}
