package e01.why;

public class MainOopExample {
    public static void main(String[] args) {
        final CalculatorOopService calculatorService = new CalculatorOopService(new CalculationImpAdd(), new CalculationImpSub(), new CalculationImpMulti(), new CalculationImpDiv());

        int addResult = calculatorService.calculationIf("+", 1, 1);
        System.out.println(addResult);
        int subResult = calculatorService.calculationIf("-", 3, 1);
        System.out.println(subResult);
        int multiResult = calculatorService.calculationIf("*", 2, 1);
        System.out.println(multiResult);
        int divResult = calculatorService.calculationIf("/", 8, 4);
        System.out.println(divResult);

        addResult = calculatorService.add(11, 4);
        System.out.println(addResult);
        subResult = calculatorService.sub(11, 1);
        System.out.println(subResult);
        multiResult = calculatorService.multi(11, 2);
        System.out.println(multiResult);
        divResult = calculatorService.div(20, 4);
        System.out.println(divResult);

    }
}


