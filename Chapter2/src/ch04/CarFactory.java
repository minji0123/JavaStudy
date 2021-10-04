package ch04;

public class CarFactory {
    public int carId;
    public String carName;
    public String carMakeYear;

    public String getCarName(){
        return  carName;
    }
    public void setCarName(String name){
        carName = name;
    }

    public void showCarInfo(){
        System.out.println( "차대번호 : " + carId + ", 차량이름 : "+carName + ", 제작일자 : " + carMakeYear);
    }
}

class CarFactoryPrint {
    public static void main(String[] args) {

        // 참조변수이다.
        // CarFactory 타입인 car1 변수가 선언되었고, 이 변수가 힙 메모리에 할당되는데, println 해보면 그 주소의 값이 출력된다..
        CarFactory car1 = new CarFactory();
        car1.carId = 123;
        car1.setCarName("마티즈");
        car1.carMakeYear = "2019년";
        car1.showCarInfo();
    }

}