package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandlingTWR {

    public static void main(String[] args) {
//        FileInputStream fis = null;

        try (FileInputStream fis = new FileInputStream("a.txt")) {
//            fis = new FileInputStream("a.txt");
            System.out.println("a.txt open");

        } catch (FileNotFoundException e) { // 얘는 파일을 열려고 찾을 때, 없어서 나타나는 오류이고
            e.printStackTrace();

        } catch (IOException e) { // 얘는 파일을 닫을 때 나타나는 오류
            e.printStackTrace();
        }

        System.out.println("try catch finish"); // 얘가 출력되었다는 거는, 프로그램이 죽지 않고, 코드 실행이 되었다는 뜻
    }
}
