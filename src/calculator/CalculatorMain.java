package calculator;

public class CalculatorMain {

    public static void main(String[] args) {

    Calculator c1 = new Calculator();
    c1.letPlus(5);
    c1.letMinus(1);
    c1.letMulti(10);
    c1.letDivi(2);
    c1.showCalResult();

//    c1.showCalCount();
    c1.showCalHistory();
    System.out.println(c1.showCalHistoryResult());
    }
}
// 여기서 calCount가 되는 이유는
// 생성자 하나에서, 여러번 계산을 했기 때문이다.