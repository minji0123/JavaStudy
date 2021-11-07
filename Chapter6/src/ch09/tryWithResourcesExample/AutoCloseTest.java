package ch09.tryWithResourcesExample;

import ch09.tryWithResourcesExample.AutoCloseableObj;

public class AutoCloseTest {

    public static void main(String[] args) {
        /*
        // try-with-resources
        try(AutoCloseableObj obj = new AutoCloseableObj()){
        }catch(Exception e){
            System.out.println("exception");
        }
        System.out.println("finish");

         */

        // 예외 강제 발생
       try(AutoCloseableObj obj = new AutoCloseableObj()){
           System.out.println("AutoCloseTest 클래스 main 함수 : try");
            throw new Exception();

        }catch(Exception e){
            System.out.println("AutoCloseTest 클래스 main 함수 : exception");
        }
        System.out.println("AutoCloseTest 클래스 main 함수 : finish");
    }
}
