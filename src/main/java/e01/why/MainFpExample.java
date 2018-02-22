package e01.why;

public class MainFpExample {
    public static void main(String[] args) {
        CalculatorFpService calculatorFpService = new CalculatorFpService();
        final Calculation add = (i1, i2) -> i1 + i2;
        System.out.println(calculatorFpService.calculate(add, 11, 4));
        System.out.println(calculatorFpService.calculate((i1, i2) -> i1 - i2, 11, 1));
        System.out.println(calculatorFpService.calculate((i1, i2) -> i1 - i2, 11, 2));
        System.out.println(calculatorFpService.calculate((i1, i2) -> i1 - i2, 20, 4));
    }
}


