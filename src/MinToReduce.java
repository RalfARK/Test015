import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinToReduce {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, -2, 12, 4, 0, -5, 9);

        Optional<Integer> minInt = list.stream()
                .reduce((arg1, arg2) -> arg1.intValue() < arg2.intValue() ? arg1 : arg2 );
        minInt.ifPresent(System.out::println);


        List<String> list1 = Arrays.asList("k1", "k2", "k3", "k4");
        List<String> list2 = Arrays.asList("asd4", "qwert6", "X", "jbjj5", "a2", "bmgjfjti9", "a2", "b2");
        Optional<String> minString = list2.stream()
                .reduce((arg1, arg2) -> arg1.length() < arg2.length() ? arg1 : arg2);
        minString.ifPresent(System.out::println);


        List<List<String>> orders = Arrays.asList(list1, list2);
        List<String> l1 = orders.stream()
                .flatMap(or -> or.stream())
                .collect(Collectors.toList());

        l1.forEach(System.out::println);
    }


}
