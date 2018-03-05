package e02.functional.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceExample02 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = i -> i > 0;
        System.out.println(isPositive.test(1));
        System.out.println(isPositive.test(0));
        System.out.println(isPositive.test(-1));

        List<Integer> numbers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);

        System.out.println("positive -> " + filter(numbers, i -> i > 0));
        System.out.println("less than 3.. -> "  +filter(numbers, i -> i < 3));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T input : list) {
            if (filter.test(input)) {
                result.add(input);
            }
        }
        return result;
    }


}
