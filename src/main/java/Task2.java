import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> listOfName = List.of("Ivan", "Mariya", "Peter", "Oleg", "Stepan", "Tanya");

        List<String> result=listOfName.stream()
                    .map((item) -> item.toUpperCase())
                    .sorted((item1, item2) -> item2.compareTo(item1))
                    .collect(Collectors.toList());

        System.out.println("result = " + result);
    }
}
