package streamapi.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNum {

public FindMaxNum()
{
    System.out.println("hii");
}



    public static void main(String[] args) {
        List<Integer> lists= new ArrayList<>();
        lists.add(100);
        lists.add(200);
        lists.add(300);

        List<Integer> list1=Arrays.asList(100,200,300,600);

        lists.retainAll(list1);

        System.out.println(lists);

//        FindMaxNum fin=new FindMaxNum();

//        System.out.println( lists.stream().filter(e->e%2==0).count());
//
        //lists.stream().max().foreach(e-> System.out.println(e));
//        lists.stream().max(Integer::compareTo).ifPresent(System.out::println);
//
//        int midIndex=lists.size()/2;
//
//        Optional<Integer> midElement=lists.stream().skip(midIndex).findFirst();
//
//        midElement.ifPresent(System.out::println);




    }


}
