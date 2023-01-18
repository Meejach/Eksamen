import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TalTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void opret10TilfældigeTalOgRetunereDem() {
        Tal tal = new Tal();
        tal.lavMangeTal();
        ArrayList<Integer> tilfældigeTal = tal.getTilfældigeTal();
        assertEquals(10, tilfældigeTal.size());
        System.out.println(tilfældigeTal);
    }

}