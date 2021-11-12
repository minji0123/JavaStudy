package java1112test;

import java.util.Arrays;

public class ArrayAscRun {

    public static void main(String[] args) {
        int[] scores = { 3, 2, 5, 6, 7, 8, 1, 0, 88, 34, 23 };
        System.out.println("원본출력");
        System.out.println(Arrays.toString(scores));

        // 1. sort() 메소드는 기본으로 오름차순 정렬이다.
        Arrays.sort(scores);
        System.out.println("오름차순");
        for (int x = 0; x < scores.length; x++) {
            System.out.printf("[%d] : %d ", x, scores[x]);
        }
        System.out.println();
    }
}
