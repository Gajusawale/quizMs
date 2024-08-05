package streamapi.examples;

import java.util.Arrays;
import java.util.List;

public class FindUniqueNumber {

    public static void main(String[] args) {
        List<Integer> lists= Arrays.asList(12,3,2,2,3,4,5,4,3);

        lists.stream().distinct().forEach(System.out::println);



        lists.stream().sorted().forEach(System.out::println);
    }
}
