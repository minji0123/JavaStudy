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
package ch04;

public class VIPCustomer extends Customer {

    private String agentID;
    double salesRatio;


    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    // 상위클래스Customer와 다른 부분 : 10% 할인해주는 것
    @Override // 애노테이션. 컴파일러에게 특별한 정보를 제공해주는 역할
    // 오버라이딩 : 상위 클래스에 정의된 메소드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우,
    // 하위클래스에서 동일한 이름의 메소드를 재정의할 수있음
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price*salesRatio);
        return super.calcPrice(price);
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
