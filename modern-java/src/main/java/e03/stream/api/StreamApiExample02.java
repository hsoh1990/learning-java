package e03.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample02 {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Integer result = null;
        for (final Integer number : numbers) {
            if (number > 3 && number < 10) {
                Integer newNumber = number * 2;
                if (newNumber > 10) {
                    result = newNumber;
                    break;
                }
            }
        }
        System.out.println("Imperative Result = " + result);

        System.out.println("Functional Result " +
                numbers.stream()
                .filter(number -> number > 3)
                .filter(number -> number < 10)
                .map(number -> number * 2)
                .filter(number -> number > 10)
                .findFirst());
    }
}
