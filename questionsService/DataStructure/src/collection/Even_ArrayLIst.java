package collection;

import java.util.*;
import java.util.stream.Collectors;

public class Even_ArrayLIst {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();

        nums.addAll(Arrays.asList(12,11,34,23,23,7,34,5,4,8));

    List<Integer> list=   nums.stream().filter(i->(i%2!=0)).collect(Collectors.toList());



        System.out.println(list);

       ListIterator<Integer> it= nums.listIterator();

       while(it.hasNext())
       {
           System.out.println(it.next());
       }

       while (it.hasPrevious())
       {
           System.out.println(it.previous());
       }
    }
}
