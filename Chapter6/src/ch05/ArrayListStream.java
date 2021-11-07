package ch05;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ArrayListStream {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(n-> System.out.print(n+"\t"));
        System.out.println();

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum : "+ sum);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
        System.out.println("ArrayList sum : "+sum2);

        // ArrayList를 출력하려면 객체생성하고 넣어줘야 한다.(일회성)
        // 아니면 list객체.stream()으로 하나하나 객체를 생성해줘야 한다.
        Stream<Integer> stream = list.stream();
        stream.forEach(n-> System.out.print(n+"\t"));
        System.out.println();

//        list.stream().sum();





    }
}
