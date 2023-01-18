import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BMITest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void MBITest() {
        BMI bmi = new BMI(1.88, 100);
        BMI bmi1 = new BMI(1.90, 65);
        BMI bmi2 = new BMI(1.60, 60);
        assertTrue(bmi.isOverWeight());
        assertFalse(bmi.isUnderWeight());
        assertTrue(bmi1.isUnderWeight());
        assertTrue(bmi2.isNormalWeight());
    }


}