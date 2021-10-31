package test1029;

public class Calc {

    int num = 0;
    int result =0;
    public Calc(int num){
        this.num = num;
    }

    public int plus(int x){
        this.result = this.num+x;
        return result;
    }

    public void print(){
        System.out.println(this.result);
    }
}
