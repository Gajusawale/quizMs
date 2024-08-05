import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringExample {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,2,4,5,3);

        Set<Integer> set=new HashSet<>();

       List<Integer> list= integers.stream().filter(e->!set.add(e)).collect(Collectors.toList());

        System.out.println(list);



    }


}
