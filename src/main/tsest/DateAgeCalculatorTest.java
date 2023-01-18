import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DateAgeCalculatorTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void DateAgeCalculatorTest() {
        DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(23, 28);
        assertFalse(dateAgeCalculator.forUng());
        DateAgeCalculator dateAgeCalculator1 = new DateAgeCalculator(30, 18);
        assertTrue(dateAgeCalculator1.forUng());
    }


}