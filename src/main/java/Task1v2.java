import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1v2 {

    public static void main(String[] args) {
        List<String> listOfName = List.of("Ivan", "Mariya", "Peter", "Oleg", "Stepan", "Tanya");
        String [] arrayOfName = listOfName.toArray(new String[0]);

        String result = IntStream.range(0, listOfName.size())
                .filter(index-> index%2!=0)
                .mapToObj(index->String.format ("%d.%s", index, arrayOfName[index]))
                .collect(Collectors.joining(", "));
        System.out.println("result = " + result);
    }
}
