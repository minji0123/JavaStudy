package ch09;

public class ArrayIndexException {
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5};

        /*
        for (int i=0; i<=5; i++){
            System.out.println(arr[i]);
        }

        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5  --> 5때문에 오류가 났다.
        at ch09.ArrayIndexException.main(ArrayIndexException.java:9)
        */

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.print(arr[i]+" ");
            }
        }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage()); // 5
                System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: 5
        }
        System.out.println("try catch finish");
    }
}
