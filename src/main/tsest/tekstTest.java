import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class tekstTest {
    Tekst tekst = new Tekst();

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void tilføjOgFindUnikkeTest() {
        tekst.tilføj("Lulu");
        tekst.tilføj("Thresh");
        tekst.tilføj("Neeko");
        tekst.tilføj("Jinx");
        tekst.tilføj("Jinx");
        assertEquals(5,tekst.getTekstLinjer().size());
        assertEquals(3,tekst.findAntalUnikke());
    }

    @Test
    public void tilføjOgFindUnikkeTestTo() {
        tekst.tilføj("Lulu");
        tekst.tilføj("Thresh");
        tekst.tilføj("Thresh ");
        tekst.tilføj("Neeko");
        tekst.tilføj("Neeko");
        tekst.tilføj("Jinx");
        tekst.tilføj("Jinx");
        assertEquals(7,tekst.getTekstLinjer().size());
        assertEquals(3,tekst.findAntalUnikke());
    }
}