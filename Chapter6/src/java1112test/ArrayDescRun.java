package java1112test;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDescRun {

    public static void main(String[] args) {
        int[] scores = { 3, 2, 5, 6, 7, 8, 1, 0, 88, 34, 23 };
        System.out.println("원본출력");
        System.out.println(Arrays.toString(scores));

        // 1. sort() 메소드를 사용해서 내림차순 정렬
        Arrays.sort(scores);
        System.out.println("내림차순");
        for (int x = scores.length-1; x >= 0; x--) {
            System.out.printf("[%d] : %d ", x, scores[x]);
        }
        System.out.println();

        // 2. 정수 데이터 타입을 사용해서 내림차순 정렬
        Integer[] arr = { 3, 2, 5, 6, 7, 8, 1, 0, 88, 34, 23 };

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

}
