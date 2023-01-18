import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class KeywordTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void matchesTestOgUdskriv() {
        Keyword keyword = new Keyword("League Of Legends", "Online spil");
        keyword.seeAlsoUdfyld();
        assertFalse(keyword.matches("Naruto"));
        assertTrue(keyword.matches("LEAGUE OF"));
        keyword.udskrift();

    }


}