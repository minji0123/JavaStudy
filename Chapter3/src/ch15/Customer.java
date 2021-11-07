package ch15;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("customer sell");
    }

    @Override
    public void sell() {
        System.out.println("customer buy");

    }

    // buy랑 cell 인터페이스가 중복되었기 때문에 둘중 하나로 골라서 재정의해야한다.
    @Override
    public void order() {
//        Buy.super.order(); // buy거를 사용하겠다.
//        Sell.super.order(); // Sell거를 사용하겠다.
        System.out.println("customer order"); // 재정의해도 된다.
    }

    public void hello(){
        System.out.println("hello");
    }
}
