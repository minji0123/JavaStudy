package ch04;

public class CustomerTest {
    public static void main(String[] args) {

        // 1. customerLee는 calcPrice가 일반고객용
        Customer customerLee = new Customer(10010,"이철수");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo()+ price);

        // 2. customerKim은 calcPrice가 vip고객용
        VIPCustomer customerKim = new VIPCustomer(10020, "김철수");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo()+price);


        // 3. 형 변환vc는 calcPrice가 vip고객용
        // 가상메소드 : 실제 인스턴스의 메소드가 호출됨
        Customer vc = new VIPCustomer(12345,"vc님"); // type은 customer
        vc.calcPrice(1000);
        System.out.println(vc.calcPrice(1000));
    }
}
