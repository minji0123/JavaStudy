//package ch08;
//
//public class Order {
//    public String orderNum;
//    public String phoneNum;
//    public String address;
//    public int date;
//    public int time;
//    public int price;
//    public int foodNum;
//
//    public Order(String orderNum, String phoneNum, String address, int date, int time, int price, int foodNum) {
//        this.orderNum = orderNum;
//        this.phoneNum = phoneNum;
//        this.address = address;
//        this.date = date;
//        this.time = time;
//        this.price = price;
//        this.foodNum = foodNum;
//    }
//
//    public String showOrder(){
//        return "주문 접수 번호 : " +orderNum+ " "+"주문 핸드폰 번호 : " +phoneNum+" "+
//                "주문 집 번호 : "+address+" "+"주문 날짜 : " +date+ " "+ " 주문 시간 : "+time+" "+"주문 가격 : "+price+" "+"메뉴 번호 : "+foodNum;
//    }
//}
//class OrderTest{
//    public static void main(String[] args) {
//        Order firstOrder = new Order(202011020003,01023450001,"서울시 강남구 역삼동 111-333"+20201102,130258,35000,0003);
//        System.out.println(firstOrder.showOrder());
//    }
//}