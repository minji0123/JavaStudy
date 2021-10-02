//public class Factory{
//        String x = "검정";
//    public static void main(String[]args){
//        Factory car1
//    }
//}


//public class Factory {
//    static void fuelLevel(){
//        System.out.println("연료는 5");
//    }
//    public static void main(String[]args){
//        fuelLevel();
//        fuelLevel();
//        fuelLevel();
//    }
//}

//public class Factory {
//    static int fuel(int x){
//        return x;
//    }
//    public static void main(String[]args){
//        System.out.println(5);
//        System.out.println(5);
//        System.out.println(5);
//    }
//}

//public class Factory {
//        int x = 5;
//
//    public static void main(String[]args){
//        Factory fuel = new Factory();
//        System.out.println(fuel.x);
//    }
//}

//
//public class Factory {
//    static void fuel(int Fuel){
//        System.out.println(Fuel + "만큼 주입 ");
//    }
//
//    public static void main(String[] args) {
//        fuel(5);
//        fuel(6);
//        fuel(7);
//    }
//}

//
public class Factory {
    static void fuel(String text,int Fuel ){
        System.out.println(text + Fuel + "만큼 주입");
    }

    public static void main(String[] args) {
        fuel("마티즈는 ",5 );
        fuel("아반떼는 ",6 );
        fuel("소나타는 ",7 );
    }
}
//
//
//public class Factory{
//    static void fuelCompare(String text, int fuelValue) {
//        if (text.equals("마티즈는") & fuelValue == 5) {
//            System.out.println(text + fuelValue + " 만큼 주입");
//        } else if (text.equals("아반떼는") & fuelValue == 6) {
//            System.out.println(text + fuelValue + " 만큼 주입");
//        } else {
//            System.out.println(text + fuelValue + " 만큼 주입");
//        }
//    }
//    public static void main(String[]args){
//        fuelCompare("마티즈는 ",5 );
//        fuelCompare("아반떼는 ",6 );
//        fuelCompare("소나타는 ",7 );
//    }
//}
//
//public class Factory {
//    static int fuelInt(int x, int y){
//        return x+y;
//    }
//    static double fuelDouble(double x, double y){
//        return  x+y;
//    }
//    public static void main(String[] args){
//        int fuelLevel1 = fuelInt(5,6);
//        double fuelLevel2 = fuelDouble(5.3,6.3);
//        System.out.println("int : "+ fuelLevel1);
//        System.out.println(("double : "+ fuelLevel2));
//    }
//}