import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        generateStream(25214903917L, 11L, (long) Math.pow(2, 48), 0L)
                .limit(5)
                .forEach(System.out::println);
    }

    static Stream<Long> generateStream(long a, long c, long m, long seedf) {
        return Stream.iterate(seedf, (seed) -> (1 * (a * seed + c) % m));
    }
}

