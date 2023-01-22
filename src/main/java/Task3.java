import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        String[] figures = new String[]{"1, 2, 0", "4, 5"};

        List<String> sortedFigures=
                Arrays.stream(figures)
                        .map(line -> (line.split(", ")))
                        .flatMap(array->Arrays.stream(array))
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println("sortedFigures = " + sortedFigures);
    }
}
