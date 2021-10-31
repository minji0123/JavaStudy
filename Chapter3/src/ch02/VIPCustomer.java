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
package ch02;

public class VIPCustomer extends Customer{
    // 상속받아서 쓸모없어진 맴버변수
//    private int customerID;
//    private String customerName;
//    private String customerGrade;
//    int bonusPoint;
//    double bonusRatio;
    
    // vip고객을 위한 맴버변수
    private String agentID;
    double salesRatio;

    public VIPCustomer(){
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP"; // protected 로 접근 가능해짐
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
