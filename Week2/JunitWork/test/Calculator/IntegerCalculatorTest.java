package Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerCalculatorTest {
    @DisplayName("Div 1/2 = 0")
    @Test
    void testIntegerDivision_1DividedBy2_ShouldBe_0() {
        //Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = 1;
        int y = 2;
        int expect = x/y;
        // Act
        int res = ICalc.integerDivision( x, y);
        //Assert
        assertEquals( expect, res, () -> "Division" + x + "/" + 4 + "Did not produce " + res );
//        assertEquals( expect, res, () -> {
//            String msg = String.format("Division %s/%s did not product %s", x, y, res);
//            return msg;
//        });
    }
    @Test
    @DisplayName("Div 4/2=2")
    void testIntegerDivision_4DiividedBy2_ShouldBe_2() {
        IntegerCalculator ICalc = new IntegerCalculator();
        int res = ICalc.integerDivision( 4, 2);
        int expect = 2;
        assertEquals( expect, res, "4/2 did not produce 2");
    }
    @Test
    @DisplayName("Div 4/0 => exception")
    void testIntegerDivision_4DiividedBy0_ShouldBe_Exception() {
        // Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x =  4;
        int y =  0;
        //Act & Assert
        ArithmeticException AExcept = assertThrows( ArithmeticException.class, () ->{
            ICalc.integerDivision(x,y);
        }, "Divive By Zer Should throw exception");
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