package e02.Interface;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class FunctionalInterfaceExample03 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        printIfValidIndex(0, getVerryExpensiveValue());
        printIfValidIndex(-1, getVerryExpensiveValue());
        printIfValidIndex(-2, getVerryExpensiveValue());
        System.out.println("It took " + ((System.currentTimeMillis() - start) / 1000) + " seconds");
        start = System.currentTimeMillis();
        printIfValidIndexFunctional(0, () -> getVerryExpensiveValue());
        printIfValidIndexFunctional(-1, () ->getVerryExpensiveValue());
        printIfValidIndexFunctional(-2, () ->getVerryExpensiveValue());
        System.out.println("It took " + ((System.currentTimeMillis() - start) / 1000) + " seconds");
    }


    private static String getVerryExpensiveValue() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "wellstone";
    }

    private static void printIfValidIndex(int number, String value) {
        if (number >= 0) {
            System.out.println("The value id " + value);
        } else {
            System.out.println("Invalid");
        }
    }

    private static void printIfValidIndexFunctional(int number, Supplier<String> valueSupplier) {
        if (number >= 0) {
            System.out.println("The value id " + valueSupplier.get());
        } else {
            System.out.println("Invalid");
        }
    }
}
