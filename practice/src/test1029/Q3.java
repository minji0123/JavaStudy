package test1029;

public class Q3 {
    public static void main(String[] args) {
        int sum =0;

            for(int num=0; num<99; num++){
                if(num%2 !=1){
                    sum +=num; // 세미클론 오류 수정
                }
            }
        System.out.println("0부터 99까지 수에서 홀수의 합 : "+sum); // 결과 출력
    }
}
