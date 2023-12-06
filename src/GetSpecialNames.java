import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetSpecialNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anton", "Denis", "Igor", "Maksim", "Petro","Ivan", "Sasha", "Oleg");

        String res = namesWithOddIndex(names);
        System.out.println(res);
    }

    public static String namesWithOddIndex(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> (index + 1) + ". " + names.get(index))
                .collect(Collectors.joining(", "));
    }
}
