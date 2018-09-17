package e03.stream.api;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamApiExample03 {
    public static void main(String[] args) {

        System.out.println("toList() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .collect(toList())
        );

        System.out.println("toSet() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .collect(toSet())
        );

        System.out.println("joining() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .collect(joining())
        );

        System.out.println("joining() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .collect(joining(", "))
        );

        System.out.println("joining() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .collect(joining(", ", "[","]"))
        );

        System.out.println("distinct().joining() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .distinct()
                        .collect(joining(", ", "[","]"))
        );

        System.out.println("distinct().joining() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 2)
                        .map(i -> i * 2)
                        .map(i -> "#" + i)
                        .distinct()
                        .collect(toList())
        );

        final Integer integer3 =3;
        System.out.println("find() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i == integer3)
                        .findFirst()
        );

        System.out.println("count() : " +
                Stream.of(1, 3, 3, 5, 5)
                        .filter(i -> i > 3)
                        .count()
        );

        Stream.of(1, 3, 3, 5, 5)
                .forEach(i-> System.out.print(i+ " "));
    }
}
