/*
[멤버쉽 시나리오]
- 일반 고객(Customer)과, 우수 고객(VIPCustomer)에 따른 서비스 제공
- 멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기
-------------------------------------------------------------------
[우수 고객_VIPCustomer]
- 고객의 속성 : 고객아이디, 고객이름, 고객등급, 보너스포인트, 보너스포인트 적립비율 --> Customer와 중복되는 내용은 상속 처리
- 우수 고객의 경우 물품 구매시 5%의 보너스 포인트 적립
- 제품을 살 때 10%를 할인해줌
- 담당 전문 상담원이 배정함
 */
package ch03;

public class VIPCustomer extends Customer {

    private String agentID;
    double salesRatio;

    // 1. 상위클래스의 생성자가 기본 생성자일때
//    public VIPCustomer(){
//        // 상속을 받은 경우에는 컴파일러가 super를 자동으로 생성해준다.
//        // 하위클래스가 상위클래스 인스턴스의 참조값을 가지게 됨
//        super();
//
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//        System.out.println("VIPCustomer() 호출");
//    }

    // 2. 상위클래스의 생성자가 매개변수 생성자일때
    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer(int, String) 호출");
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
