import java.util.stream.Stream;

public class EndlessStream {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = 883L; //вибрала найближче просте число до 1000
        generator(a, c, m, seed).forEach(System.out::println);
    }

    public static Stream<Long> generator(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
