import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotherBoardTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void MotherboardTest() {
        MotherBord motherBord = new MotherBord();
        assertTrue(motherBord.tilføjDrive());
        assertTrue(motherBord.tilføjDrive());
        assertTrue(motherBord.tilføjDrive());
        assertTrue(motherBord.tilføjDrive());
        assertFalse(motherBord.tilføjDrive());
        motherBord.udskrivDrives();
    }


}