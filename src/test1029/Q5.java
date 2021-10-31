package test1029;

public class Q5 {
    String name = "";
    String address = "";
    int age = 0;
    int height = 0;
    int weight = 0;

    //1. 기본 생성자
    Q5(){}
    
    // 생성자 오버로딩
    // 2. 이름과 주소, 나이를 물어보는 생성자
    public Q5(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    // 생성자 오버로딩
    // 3. 이름과 키, 몸무게를 물어보는 생성자
    public Q5(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}
