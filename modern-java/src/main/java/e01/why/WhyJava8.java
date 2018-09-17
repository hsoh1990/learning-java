package e01.why;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8 {
    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public static void main(String[] args) {
        //"1 : 2 : 3 : ..... : 9" 출력하기

        //과거 for loop 사용
        StringBuilder stringBuilder1 = new StringBuilder();
        final int size = numbers.size();
        for (Integer i = 0; i < size; i++) {
            stringBuilder1.append(numbers.get(i));
            if (i != size - 1) {
                stringBuilder1.append(" : ");
            }
        }

        System.out.println(stringBuilder1.toString());

        //for-each 사용
        StringBuilder stringBuilder2 = new StringBuilder();
        for (final Integer number : numbers) {
            stringBuilder2.append(number).append(" : ");
        }

        final int stringLength = stringBuilder2.length();
        final String separator = " : ";
        if (stringLength > 0) {
            stringBuilder2.delete(stringLength - separator.length(), stringLength);
        }

        System.out.println(stringBuilder2);

        //java 8 사용
        final String result = numbers.stream()
                                     .map(String::valueOf)
                                     .collect(joining(" : "));

        System.out.println(result);
    }
}
