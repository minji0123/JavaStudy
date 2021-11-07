package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandlingTCF {

    public static void main(String[] args) {
        /*
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            System.out.println("a.txt open");

            try {
                fis.close();
                System.out.println("a.txt close");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e);

            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        System.out.println("try catch finish");
    }
    // 이러면 try catch 가 너무많아진다.
    */
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            System.out.println("a.txt open");

        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e);
            return;
        } finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally finish");
        }
        System.out.println("try catch finish"); // return 을 해주면 여기까지 못온다.
    }
}
