package test1029;

public class Q2 {
    public static void main(String[] args) {
        for (int x=2; x <=9; x++){
            System.out.printf("%d단\n",x);
            for(int y=1; y<=9; y++){
                int z = x*y;
                System.out.printf("%d x %d = %d\n",x,y,z);
            }
            System.out.println("--------------------------------");
        }
    }
}

