package staticStudy;

public class Circle {
    static float PI = 3.14f;
    float radius;
    float result;
    int constMadeCount=0;
    int methodMadeCount=0;
    static int staticMadeCount=0;


    Circle(
    ){
        Circle.staticMadeCount++;
        this.constMadeCount++;
    }
    Circle(float radius){
        Circle.staticMadeCount++;
        this.constMadeCount++;
        this.radius = radius;
    }

    int getConstCount(){
        return this.constMadeCount;
    }

    void showCircleArea(float x){
        this.result = x*x*PI;
        this.methodMadeCount++;
        System.out.println("원 넓이(반지름:"+x+") : "+this.result);
    }

    void showCircleArea(){
        this.result = this.radius*this.radius*PI;
        this.methodMadeCount++;
        System.out.println("원 넓이(반지름:"+this.radius+") : "+this.result);
    }

    int getMethodCount(){
        return this.methodMadeCount;
    }
}
