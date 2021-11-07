package ch15;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();


        // 업캐스팅
        // 업캐스팅하면 부모인터페이스거만 나온다.
        // 재정의된 메소드는 당연히 자식클래스거가 나온다.
        System.out.println("업캐스팅 : Buy");
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        System.out.println("업캐스팅");
        Sell seller = customer;
        seller.sell();
        seller.order();

    }
}
