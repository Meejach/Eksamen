import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void beatTest() {
        Card tenOfSpades = new Card ("spades", 10);
        Card diamond8 = new Card ("diamonds", 8);
        Card jackOfClubs = new Card ("clubs", 11);
        Card QueenOfHearts = new Card ("hearts", 12);
        assertTrue(tenOfSpades.beats(diamond8));
        assertTrue(diamond8.beats(jackOfClubs));
        assertTrue(tenOfSpades.beats(QueenOfHearts));



    }


}