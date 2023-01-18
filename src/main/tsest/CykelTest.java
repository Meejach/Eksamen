import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CykelTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void tilføjOgSum() {
        Butik butik = new Butik();
        butik.tilføj(new Cykel("Sol", "Rød", 6000));
        butik.tilføj(new Cykel("Måne", "Sort", 6700));
        butik.tilføj(new Cykel("Regn", "Grå", 4000));
        assertEquals(3, butik.getLagerListen().size());
        assertEquals(16700, butik.samletLagerBeholdning());
    }

}