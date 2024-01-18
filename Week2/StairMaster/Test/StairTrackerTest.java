import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StairTrackerTest {

    @Test
    void testStairTrack_NIs2_returns_2() {
        // Arrange
        int n = 6;
        StairTracker st = new StairTracker(n);
        // Act
        ArrayList<Integer> expectedSteps  = new ArrayList<>(
                Arrays.asList(2, 2, 2)
        );
        ArrayList<Integer> steps = st.getSteps();
        // AsseRT
        assertEquals( expectedSteps, steps);

    }
}