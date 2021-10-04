/*
James 와 Tomas 는 각각 버스와 지하철을 타고 학교에 갑니다.
James 는 5,000원을 가지고 있었고, 100번 버스를 타면서 1,000원을 지불합니다.
Tomas 는 10,000원을 가지고 있었고, 2호선을 타면서 1,200원을 지불합니다.
 */
package ch14;

public class TakeTrans {
    public static void main(String[] args) {
        Customer customerJ = new Customer("James", 5000);
        Customer customerT = new Customer("Tomes", 10000);

        // 버스는 여러 대 일 수 있는데 제임스는 100번 버스만 탄다.
        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);
        customerJ.takeBus(bus100);

        // 지하철은 여러 대 일 수 있는데 토마스는 2호선만 탄다.
        Subway line2Subway = new Subway(2);
        Subway line1Subway = new Subway(1);
        customerT.takeSubway(line2Subway);

        customerJ.showInfo();
        customerT.showInfo();

        bus100.showBusInfo();
        bus200.showBusInfo();
        line2Subway.showSubwayInfo();
        line1Subway.showSubwayInfo();
    }
}
