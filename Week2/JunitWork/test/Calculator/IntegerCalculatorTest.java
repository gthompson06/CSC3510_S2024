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
        String expectedErrorMsg = "Cannot Divide By Zero";
        //Act & Assert
        ArithmeticException AExcept = assertThrows( ArithmeticException.class, () ->{
            ICalc.integerDivision(x,y);
        }, "Divide By Zer Should throw exception");
        assertEquals( expectedErrorMsg, AExcept.getMessage() );
    }
    @DisplayName("Subtraction 4-2=2")
    @Test
    void testIntegerSubtraction_4Minus2_ShouldBe_2() {
        IntegerCalculator ICalc = new IntegerCalculator();
        int res = ICalc.integerDivision( 4, 2);
        int expect = 2;
        assertEquals( expect, res ,"4-2 did not produce 2");
    }
    @DisplayName("Subtraction 4-2=2")
    @Test
    void testIntegerSubtraction_Neg4MinusNeg2_ShouldBe_2() {
        //Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = 2;
        int y = 4;
        int expect = -2;
        // Act
        int res = ICalc.integerSubtraction( x, y);
        // Assert
        assertEquals( expect, res ,"4-2 did not produce 2");
    }
    @DisplayName("Subtraction MinInteger Minus 1 Exception")
    @Test
    void testIntegerSubtraction_MinIntMinus1_shouldBeException() {
        //Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = Integer.MIN_VALUE;
        int y = 1;
        int expect = Integer.MIN_VALUE - 1;
        // Act
        int res = ICalc.integerSubtraction( x, y);
        System.out.printf("Subtraction res=%s", res);

        // Assert
        assertEquals( expect, res ,"Except exception when less than min value");
    }
}