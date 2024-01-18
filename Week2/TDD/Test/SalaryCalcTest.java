import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalcTest {
    @DisplayName("99840 sal is 48")
    @Test
    void testSalaryCald_99_840Sal_ShouldBe48() {
        //Arrange
        double annualSal = 99840.00;
        SalaryCalc sc = new SalaryCalc(annualSal);
        double expected = 48.00;
        // Act
        double res = sc.CalcHourly();
        //Assert
        assertEquals(expected, res);
    }

    @DisplayName("100,000 sal is 48.08")
    @Test
    void testSalaryCald_100_000_Sal_ShouldBe48_08() {
        //Arrange
        double annualSal = 100000;
        SalaryCalc sc = new SalaryCalc(annualSal);
        double expected = 48.08;
        // Act
        double res = sc.CalcHourly();
        //Assert
        assertEquals(expected, res);
    }

    @DisplayName("Negatibe sal throws Exception")
    @Test
    void testSalaryCalc_negativeSal_throwsException() {
        //Arrange
        double annualSal = -1;
        SalaryCalc sc = new SalaryCalc(annualSal);
        String expectedMsg = "Illegal Negative Salary";
        // Act & Assert
        IllegalArgumentException IArg = assertThrows(IllegalArgumentException.class, () -> {
            double res = sc.CalcHourly();
        });
        //Assert
        assertEquals(expectedMsg, IArg.getMessage());
    }
}