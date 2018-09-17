package e01.why;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class  OopExampleTest {

    @Test
    public void add() {
        final Calculation calculation = new CalculationImpAdd();
        final int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void sub() {
        final Calculation calculation = new CalculationImpSub();
        final int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void multi() {
        final Calculation calculation = new CalculationImpMulti();
        final int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void div() {
        final Calculation calculation = new CalculationImpDiv();
        final int actual = calculation.calculate(4, 2);
        assertThat(actual).isEqualTo(2);
    }
}