import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BilTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void tilkoblTrailerTilBil() {
        Bil bil = new Bil(2500);
        Trailer trailer = new Trailer(700);
        Trailer trailer1 = new Trailer(1500);

        bil.tilkoblTrailer(trailer);
        assertEquals(3200, bil.totalVægt());
        bil.tilkoblTrailer(trailer1);
        assertEquals(2500, bil.totalVægt());
    }


}