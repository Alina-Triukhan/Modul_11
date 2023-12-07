import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MessStream {
    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("A", "B", "C", "D", "E", "F");
        Stream<String> secondStream = Stream.of("1", "2", "3", "4", "5");

        zip(firstStream, secondStream).forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        int size = Math.min(firstList.size(), secondList.size());
        return IntStream.range(0, size)
                .mapToObj(i -> Stream.of(firstList.get(i), secondList.get(i)))
                .flatMap(s -> s);
    }
}