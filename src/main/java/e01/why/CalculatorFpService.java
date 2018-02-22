package e01.why;

class CalculatorFpService {
    public int calculate(final Calculation calculation, final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }
}
