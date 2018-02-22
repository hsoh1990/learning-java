package e01.why;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FpExampleTest {

    private CalculatorFpService calculatorFpService = new CalculatorFpService();

    @Test
    public void calculateSuccess() {
        final int addResult = calculatorFpService.calculate((i1, i2) -> i1 + i2, 11, 1);
        final int subResult = calculatorFpService.calculate((i1, i2) -> i1 - i2, 11, 1);
        final int multiResult = calculatorFpService.calculate((i1, i2) -> i1 * i2, 11, 2);
        final int divResult = calculatorFpService.calculate((i1, i2) -> i1 / i2, 12, 6);
        assertThat(addResult).isEqualTo(12);
        assertThat(subResult).isEqualTo(10);
        assertThat(multiResult).isEqualTo(22);
        assertThat(divResult).isEqualTo(2);
    }
}