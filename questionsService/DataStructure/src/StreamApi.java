import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<String> lists= Arrays.asList("mahesh","Gajanan","Ajinkya","piyush","Janvi");

        lists.stream().filter(e -> e.endsWith("a")).
              forEach(System.out::println);
    }

}
