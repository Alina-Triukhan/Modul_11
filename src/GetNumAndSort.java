import java.util.Arrays;
import java.util.stream.Collectors;

public class GetNumAndSort {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        System.out.println(getString(array));
    }
    public static String getString (String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
