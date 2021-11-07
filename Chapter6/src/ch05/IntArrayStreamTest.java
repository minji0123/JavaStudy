package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {

        // 1. 일반적인 배열 출력
        int[] arr = {1,2,3,4,5};

//        for(int num : arr){
//            System.out.println(num);
//        }


        // 2. 스트림으로 출력
//        Arrays.stream(arr); // int 타입을 반환해줌
        IntStream is = Arrays.stream(arr);
//      forEach : 하나씩 꺼내준다(하나씩 꺼내서 뭘 할건지 적기)

        // 한번 호출하면 다시 사용할 수 없다.
        is.forEach(n-> System.out.println(n));
//        is.
        // 이렇게 다시 만들어야 한다.
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);



    }
}
