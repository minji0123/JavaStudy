package oopstudy;

public class Factory2 {
    public static void main (String[]args){
//        Factory1 firstCar = new Factory1();
//        firstCar.setCarNum(12345);
//        System.out.println(firstCar.getCarNum());

        Factory1 secondCar = new Factory1();
        System.out.println(secondCar.showCarInfo());

        Factory1 thirdCar = new Factory1(123, "마티즈", 4);
        System.out.println(thirdCar.showCarInfo());

    }
}
