package e02.functional.Interface;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        final Function<String, Integer> toInt = value -> Integer.parseInt(value);
        final Integer number = toInt.apply("100");

        System.out.println(number);

        final Function<Integer, Integer> identity = t -> t;

        System.out.println(identity.apply(999));

        final Consumer<String> print = value -> System.out.println(value);
        final Consumer<String> greetings = value -> System.out.println("Hello " + value);
        print.accept("Hello");
        greetings.accept("world");
        greetings.accept("wellstone");
    }
}
