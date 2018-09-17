package e01.why;

class CalculatorOopService {
    private Calculation add = new CalculationImpAdd();
    private Calculation sub = new CalculationImpSub();
    private Calculation multi = new CalculationImpMulti();
    private Calculation div = new CalculationImpDiv();

    public CalculatorOopService(Calculation add, Calculation sub, Calculation multi, Calculation div) {
        this.add = add;
        this.sub = sub;
        this.multi = multi;
        this.div = div;
    }


    int calculationIf(String xx, int num1, int num2) {
        if (xx.equals("+")) {
            return num1 + num2;
        } else if (xx.equals("-")) {
            return num1 - num2;
        } else if (xx.equals("*")) {
            return num1 * num2;
        } else if (xx.equals("/")) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

    public int add(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return add.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

    public int sub(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return sub.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

    public int multi(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return multi.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

    public int div(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return div.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }
}
