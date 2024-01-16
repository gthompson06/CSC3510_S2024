package Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerCalculatorTest {
    @DisplayName("Div 1/2 = 0")
    @Test
    void testIntegerDivision_1DividedBy2_ShouldBe_0() {
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = 1;
        int y = 2;
        int expect = x/y;
        int res = ICalc.integerDivision( x, y);
        String msg = String.format( "Division %s/%s did not product %s", x, y, res);
        assertEquals( expect, res, msg );
    }
    @Test
    @DisplayName("Div 4/2=2")
    void testIntegerDivision_4DiividedBy2_ShouldBe_2() {
        IntegerCalculator ICalc = new IntegerCalculator();
        int res = ICalc.integerDivision( 4, 2);
        int expect = 2;
        assertEquals( expect, res, "4/2 did not produce 2");
    }
    @DisplayName("Subtraction 4-2=2")
    @Test
    void testIntegerSubtraction_4Minus2_ShouldBe_2() {
        IntegerCalculator ICalc = new IntegerCalculator();
        int res = ICalc.integerDivision( 4, 2);
        int expect = 2;
        assertEquals( expect, res ,"4-2 did not produce 2");
    }
}