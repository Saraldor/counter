import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

    Counter value = new Counter();

    @Test
    void addition_test() {
        double output = value.Calc(2, 2, "+");

        assertEquals(4, output);
    }
    @Test
    void subtraction_test() {
        double output = value.Calc(4, 2, "-");

        assertEquals(2, output);
    }
    @Test
    void multiplication_test() {
        double output = value.Calc(3.5, 3, "*");

        assertEquals(10.5, output);
    }
    @Test
    void division_test() {
        double output = value.Calc(5, 2, "/");

        assertEquals(2.5, output);
    }
    @Test
    void textMath_test() {
        double output = value.TextToMath("(4 sub 1)");

       assertEquals(3, output);
    }
    @Test
    void textMathAsVariables_test() {
        double output = value.TextToMathWithVariables("(five sub one)");

        assertEquals(3, output);
    }
}
