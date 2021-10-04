/*
James 와 Tomas 는 각각 버스와 지하철을 타고 학교에 갑니다.
James 는 5,000원을 가지고 있었고, 100번 버스를 타면서 1,000원을 지불합니다.
Tomas 는 10,000원을 가지고 있었고, 2호선을 타면서 1,200원을 지불합니다.
 */
package ch14;

public class Customer {
    String studentName;
    int money;

    public Customer(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    public void takeBus(Bus bus){ // Bus 클래스의 bus. 어떤 버스를 탔는지를 매개변수로 받을 것이다.
        bus.take(1000);
        this.money -=1000;
        // 승객이 버스를 타서, 1000원을 지불했다.
    }
    public void takeSubway(Subway subway){ // Subway 클래스의 subway. 어떤 지하철을 탔는지를 매개변수로 받을 것이다.
        subway.take(1200);
        this.money -=1200;
    }
    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은 "+money + "원 입니다.");
    }
}

class Bus{
    int busNum;
    int passengerCount;
    int money;

    public Bus(int busNum){ // busNum 을 초기화해준다.
        this.busNum = busNum;
    }
    public void take(int money){ // 승객이 지불한 금액 -->객체 협력이 일어나는 부분
        this.money +=money;
        this.passengerCount++;
        // 승객이 돈을 지불했으니까, 돈이 늘어났고, 승객이 탑승했으니까 탑승인원도 늘어났다.
    }
    public void showBusInfo(){
        System.out.println(busNum + "번의 승객 수는 "+ passengerCount + "명 이고, 수입은 "+money+"원 입니다.");
    }
}

class Subway{
    int subwayNum;
    int passengerCount;
    int money;

    public Subway(int subwayNum){
        this.subwayNum = subwayNum;
    }
    public void take(int money){ // 승객이 지불한 금액 -->마찬가지로 객체 협력이 일어나는 부분
        this.money += money;
        this.passengerCount++;
    }
    public void showSubwayInfo(){
        System.out.println(subwayNum + "번의 승객 수는 "+ passengerCount + "명 이고, 수입은 "+money+"원 입니다.");
    }
}