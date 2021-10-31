/*
[멤버쉽 시나리오]
- 일반 고객(Customer)과, 우수 고객(VIPCustomer)에 따른 서비스 제공
- 멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기
-------------------------------------------------------------------
[일반 고객_Customer]
- 고객의 속성 : 고객아이디, 고객이름, 고객등급, 보너스포인트, 보너스포인트 적립비율
- 일반고객의 경우 물품 구매시 1%의 보너스 포인트 적립
 */
package ch02;

public class Customer {

    // 상속을 위해 private -> protected
    // 하위클래스에서는 접근가능하지만, 외부클래스에서는 접근 불가능
//    private int customerID;
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;


    public Customer(){
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        // vip고객을 위한 할인
        // 이렇게 하면 코드가 복잡해지기 때문에, 상속을 이용한다.
//        if (customerGrade.equals("SILVER")){
//            this.bonusPoint += price * bonusRatio;
//        }
//        else if (customerGrade.equals("VIP")){
//
//        }
        this.bonusPoint += price * bonusRatio;
        return price; // 가격으로 return해줌 (왜?)
    }

    // protected인 변수들 게터세터
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
    // protected인 변수들 게터세터 끝

    
    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
