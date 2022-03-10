package forStudy;

public class forMaxNum {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5};
        int max = array[0];
        int min = array[0];

        for (int row=0; row<array.length; row++){
            if(max<array[row]){
                max=array[row];
            }
            else if(min>array[row]){
                min=array[row];
            }

        }
        System.out.print("max : "+max+", min : "+min);

    }

}
