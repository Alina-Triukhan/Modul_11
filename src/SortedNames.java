import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anton", "Denis", "Igor", "Maksim", "Petro", "Ivan", "Sasha", "Oleg");

        namesReverse(names).forEach(System.out::println);
    }

    public static List<String> namesReverse(List<String> names) {
        return names.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
