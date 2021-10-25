package calculator;

public class Calculator {

    final static int ROW =100;
    final static int COL = 2;

    int total=0;
    int calCount =0;
    String [][]calHistory = new String[ROW][COL];

    // 기본생성자
    
    // 산술메소드
    int letPlus(int x){
        this.calHistory[this.calCount][0]="" + x;
        this.calHistory[this.calCount][1]="+";
        this.total +=x;
        this.calCount++;
        return this.total;
    }

    int letMinus(int x){
        this.calHistory[this.calCount][0]="" + x;
        this.calHistory[this.calCount][1]="-";
        this.total -=x;
        this.calCount++;
        return this.total;
    }

    int letMulti(int x){
        this.calHistory[this.calCount][0]="" + x;
        this.calHistory[this.calCount][1]="*";
        this.total *=x;
        this.calCount++;
        return this.total;
    }

    int letDivi(int x){
        this.calHistory[this.calCount][0]="" + x;
        this.calHistory[this.calCount][1]="/";
        this.total /=x;
        this.calCount++;
        return this.total;
    }

    void showCalResult(){
        System.out.println(this.total);
    }
    void showCalCount(){
        System.out.println(this.calCount);
    }

    void showCalHistory(){
        System.out.println("계산 히스토리");
        System.out.print("0");
        for(int row=0; row<this.calCount; row++){
            for(int col=1; col>=0; col--){
                System.out.print(this.calHistory[row][col]);
            }
        }
        System.out.println();
    }

    int showCalHistoryResult(){
        int result=0;
        System.out.println("계산 히스토리 결과");
        for (int row=0; row<this.calCount; row++){
                switch (calHistory[row][1]){
                    case "+":
                        result += Integer.parseInt(this.calHistory[row][0]);
                        break;
                    case "-":
                        result -= Integer.parseInt(this.calHistory[row][0]);
                        break;
                    case "*":
                        result *= Integer.parseInt(this.calHistory[row][0]);
                        break;
                    case "/":
                        result /= Integer.parseInt(this.calHistory[row][0]);
                        break;
                }
            }
//        System.out.println(result);
        return result;
    }

}
