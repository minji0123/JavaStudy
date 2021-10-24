/* 배열
- 동일한 자료형의 순차적 자료 구조
- 인덱스 연산자[]를 이용하여 빠른 참조 가능
- 물리적 위치와 논리적 위치가 동일
- 배열의 순서는 0부터 시작
- 자바에서는 객체 배열을 구현한 ArrayList를 많이 사용
-------------------------------------------------------
- int, double 배열은 기본 4바이트, 8바이트
- Student, Employee 배열은 좀 다르다.
 */
package ch20;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total=0;

        // 중간에는 몇번이 반복되는지 적어줘야 하기 때문에 <=는 잘 사용하지 않음
        for (int i=0, num=1; i<arr.length;i++){
            arr[i] = num++;
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // 배열 총 합 구하기
        for (int num : arr){
            total += num;
        }
        System.out.println(total);

        // 배열 총 곱 구하기
        int[] Iarr = new int[5];
        int count = 0;
        Iarr[0] = 1; count++;
        Iarr[1] = 2; count++;
        Iarr[2] = 3; count++;
        int Itotal = 1;
        for (int i=0; i<count; i++){
            Itotal *= Iarr[i];
        }
        System.out.println(Itotal);

        // 문자열 배열
        char[] alphabets = new char[26];
        char ch = 'A';
        for (int i=0; i<alphabets.length; i++){
            alphabets[i] = ch++;
//            System.out.print(alphabets[i]+ ", "+ (int)alphabets[i]);
        }
        for (char alpha : alphabets){
            System.out.println(alpha + ", " + (int)alpha);
        }

    }
}
