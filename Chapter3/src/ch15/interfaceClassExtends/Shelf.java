package ch15.interfaceClassExtends;

import java.util.ArrayList;

public class Shelf {
    //상속을 받을 수도 있으니까 protected
    protected ArrayList<String> shelf;

    // 생성할때마다 배열 생성
    public Shelf(){
        shelf =new ArrayList<String>();
    }

    // 배열 안에 들어갈 값 반환
    public ArrayList<String> getShelf(){
        return shelf;
    }

    // 배열 크기 반환
    public int getCount(){
        return shelf.size();
    }
}
