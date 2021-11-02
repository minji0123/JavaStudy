package ch03;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이철수");
//        customerLee.setCustomerID(10010);
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());
//
//
//        VIPCustomer customerKim = new VIPCustomer();
//        customerKim.setCustomerName("김철수");
//        customerKim.setCustomerID(10020);
//        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showCustomerInfo());
        // 출력결과
//        Customer() 호출     --> 1. 상위클래스의 생성자가 생성
//        VIPCustomer() 호출  --> 2. 하위클래스의 생성자가 생성
//        김철수님의 등급은 VIP이며, 보너스 포인트는 10000입니다.


        Customer customerLee = new Customer(10010,"이철수");
        customerLee.setCustomerName("이철수");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(10020, "김철수");
        customerKim.setCustomerName("김철수");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        // 출력결과_메소드추가생성자
//        Customer(int, String) 호출
//        이철수님의 등급은 SILVER이며, 보너스 포인트는 1000입니다.
//        Customer(int, String) 호출
//        VIPCustomer(int, String) 호출
//        김철수님의 등급은 VIP이며, 보너스 포인트는 10000입니다.

        // 형 변환
        Customer vc = new VIPCustomer(12345,"김영희");
        // vc의 데이터 타입은 Customer이다. customer변수와 메소드만 사용 가능
        // vc.
    }
}
