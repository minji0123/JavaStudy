package ch02;

import java.util.Arrays;

public class FunctionTest {

    // 1. 매개변수x 반환값x 메소드
    public static void sayHello1(){
        System.out.println("안녕하세요");
    }
    
    // 2. 매개변수0 반환값x 메소드
    public static void sayHello2(String greeting){
        System.out.println(greeting);
    }
    
    // 3. 매개변수x 반환값0 메소드
    public static int calcSum(){
        int sum = 0;
        int i;
        for (i=0; i<=100; i++){
            sum+=i;
        }
        return sum;
    }

    // 4. 매개변수0 반환값0 메소드
    public static int addNum(int num1, int num2){
        int result;
        result = num1+num2;
        return result;
    }

    // 5. 배열 메소드
    // 5-1 매개변수가 참조 데이터 타입(배열), 반환값x
    public static void updateArray(int[] array1){
        for(int row=0; row<array1.length; row++){
            array1[row] += 10;
        }
    }
    // 5-2 매개변수가 기본 데이터 타입, 반환값0
    public static int[] makeArray(int num3){
        int array2[]=new int [num3];
        for (int row=0; row<num3; row++){
            array2[row] = row*row;
        }
        return array2;
    }


    // 매인 메소드
    public static void main(String[] args) {

        // 1. 반환값x
        // 1-1. 매개변수x 반환값x인 메소드 출력
        sayHello1();
        // 1-2. 매개변수0 반환값x인 메소드 출력
        sayHello2("안녕하세요");


        // 2. 반환값0
        int n1=10;
        int n2=20;
        int total=0;
        // 2-1. 매개변수x, 반환값0인 메소드 출력
        total = calcSum();
        System.out.println(total); // calcSum()은 1부터 100까지 더한 값을 **출력만** 해줌
        // 2-2. 매개변수0, 반환값0인 메소드 출력
        total = addNum(n1,n2);
        System.out.println(total); // addNum()이 n1값과 n2값을 받아서 출력해줌


        // 3. 배열 출력
        // 3-1 매개변수가 배열, 반환값x인 메소드 출력
        int arrayMain1[]={1,2,3,4,5};
        updateArray(arrayMain1); // updateArray()이 arrayMain 배열 안의 값을 10씩 증가시켜줌
        System.out.println(Arrays.toString(arrayMain1)); // arrayMain 배열 출력(라이브러리 사용)

        // 5-2 매개변수가 기본 데이터 타입, 반환값0인 메소드 출력
        int x = 5;
        int arrayMain2[] = makeArray(x); //makeArray()가 5칸 배열을 만들고, 값을 제곱할 준비를 함
        for (int row=0; row< arrayMain2.length;row++){ // makeArray()가 for문에 의해 값을 채우고, 값을 제곱시킴
            System.out.print(arrayMain2[row]+" "); //  makeArray 출력
        }

    }


}

