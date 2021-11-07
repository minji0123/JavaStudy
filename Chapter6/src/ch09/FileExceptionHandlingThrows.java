package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandlingThrows {

    public static void main(String[] args) throws FileNotFoundException { // 예외를 직접 처리하지 않고 던진다는 뜻. main함수에서 던지기 때문에, VM으로 넘어가버린다. --> 콘솔에 문장하나만 찍히고 끝남

        FileInputStream fis;

        fis = new FileInputStream("a.txt");
    }
}
