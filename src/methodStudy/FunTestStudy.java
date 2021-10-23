package methodStudy;

public class FunTestStudy {

    // 매개변수 없고, 반환값이 없음
    void sayHi1(){
        System.out.println("안녕하세요");
    }

    // 매개변수 있고, 반환값이 없음
    void sayHi2(String hello){
        System.out.println(hello);
    }

    // 매개변수 없고, 반환값이 있음
    int addNum100(){
        int sum=0;
        for (int i=0; i<=100; i++){
            sum += i;
        }
        return sum;
    }

    // 매개변수 있고, 반환값이 있음
    int addNumXY(int x, int y){
        int result = x+y;
        return result;
    }
    
    // 배열 출력
    // 매개변수가 참조변수(배열), 반환값 없음
    void updateArray10(int array1[]){
        for (int row=0; row<array1.length; row++){
            array1[row] +=10;
        }
    }

    // 매개변수가 참조변수(배열), 반환값 있음
    int []updateArray20(int array1[]){
        for (int row=0; row<array1.length; row++){
            array1[row] +=20;
        }
        return array1;
    }
    

    // 매개변수가 기본변수(값), 반환값 없음
    void makeArrayY(int y){
        int array[] = new int[y];
        int row = 0;
        for (row=0; row<array.length; row++){
            array[row] = y*y;
            System.out.print(array[row]+ " ");
        }
        System.out.println();
    }


    // 매개변수가 기본변수(값), 반환값 있음
    int []makeArrayX(int x){
        int array[] = new int[x];
        for (int row=0; row<array.length; row++){
            array[row] = x+x;
        }
        return array;
    }


    // 매개변수가 가변인수, 반환값 없음
    void argChangeArrayX(int...x){
        System.out.println("가변인수x 개수 : " + x.length);
        for (int row=0; row<x.length; row++){
            System.out.print(x[row]+" ");
        }
        System.out.println();
    }

    // 매개변수가 가변인수, 반환값 있음
    int []argChangeArrayY1(int...y){
        System.out.println("가변인수y 개수 : " + y.length);
        int array1[] =new int[y[0]];
        for (int row=0; row<array1.length; row++){
           array1[row]=row;
        }
        return array1;
    }
    
    // 매개변수가 기본변수와 가변인수, 반환값 있음
    int []argChangeArrayY(int x,int...y){
        System.out.println("가변인수y 개수 : " + y.length);
        for (int row=0; row<y.length; row++){
            y[row] = x*x;
        }
        return y;
    }
}
