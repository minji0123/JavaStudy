package test1029;

public class Q7 {
    public static void main(String[] args) {
        int max = 0;
        int []array = {1,5,3,8,2};

        for (int cnt=0; cnt<5; cnt++){
            if(array[cnt]>cnt){
                max = array[cnt];
            }
        }
        System.out.println("array[] 배열의 최댓값 : "+max);
    }
}
