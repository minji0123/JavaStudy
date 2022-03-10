package test1029;

public class Q5a {
    int height;
    int width;

    // 메소드 오버로딩
    // 1. 직사각형 넓이
    int areaRectangle(int height, int width){
        return height*width;
    }
    
    // 메소드 오버로딩
    // 2. 정사각형 넓이
    int areaRectangle(int height){
        return height*height;
    }
}
