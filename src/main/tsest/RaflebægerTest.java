import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RaflebægerTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void rystOgSeTest() {
        Raflebæger raflebæger = new Raflebæger(2);
        raflebæger.ryst();
        ArrayList<Integer> se = raflebæger.se();
        assertEquals(se.size(),2);
    }

}