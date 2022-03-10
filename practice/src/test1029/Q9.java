package test1029;

public class Q9 {
    static final int MAX_RANDOM_COUNT=100;

    int[] values = new int[MAX_RANDOM_COUNT];

    Q9(){
        int cnt=0;

        while (true){
            if(cnt >= MAX_RANDOM_COUNT){ // cnt = 100이면 break
                break; // 세미클론 미포함 오류
            }
            values[cnt++] = (int)(Math.random()*MAX_RANDOM_COUNT)+1; // 1~100까지 랜덤함수 생성이므로 +1을 해준다.
        }
    }

    void print(){
        for(int cnt=1; cnt <=MAX_RANDOM_COUNT; cnt++){ // 1부터 100까지니까
            System.out.printf("value[%d][%d]\n",cnt,values[cnt-1]); // cnt = 0~100이기 때문에 -1을 해줘야 한다.
        }
    }

    public static void main (String[]args){
        Q9 q9 = new Q9();
        q9.print();
    }
}
