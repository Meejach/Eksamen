import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Tal2Test {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void tætTalTest() {
        Tal2 tal = new Tal2();
        assertEquals(0,tal.tælTal(24));
        assertEquals(3,tal.tælTal(66));
    }

    @Test
    public void gennemsnitTest(){
        Tal2 tal = new Tal2();
        assertNotEquals(1,tal.gennemsnit());
        assertEquals(55,tal.gennemsnit());

    }

}