package ch08;

public class Male {
    public int height;
    public int mass;
    public String name;
    public int year;

    public Male(int height, int mass, String name, int year){
        this.height = height;
        this.mass = mass;
        this.name = name;
        this.year = year;
    }
    public String showMaleInfo(){
      return name + "("+year+")는 키가 " +height +"이고, 몸무게가 "+mass+"입니다.";
    }
}

class MaleInfo{
    public static void main(String[] args) {
        Male maleTomas = new Male(180,78,"Tomas",37);
        System.out.println(maleTomas.showMaleInfo());
    }
}