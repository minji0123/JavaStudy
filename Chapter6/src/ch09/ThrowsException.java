package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    // 예외 처리를 하기 위해 일부러 오류를 발생시킨 메소드
    public Class loadclass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();
        // 예외를 따로따로 처리하기
        /*
        try {
            test.loadclass("a.txt", "abc");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException : " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException : " +e);
        }
        System.out.println("finish");
         */

        // 예외를 한번에 처리하기
        /*
        try {
            test.loadclass("a.txt", "abc");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("finish");
         */

        // 최상위 예외 넣기
        try {
            test.loadclass("a.txt", "abc");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e){
            // 서술한 예외 외의 다른 예외 처리 가능
            // 자동 형변환 처리됨
            // 맨 아래에 적어야 함
        }

        System.out.println("finish");
    }
}
