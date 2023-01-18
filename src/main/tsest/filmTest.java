import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class filmTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void filmMedTitelOgÅr() {
        Film film = new Film("Avatar", 2010);
        assertEquals("Avatar", film.getFilmtitel());
        assertEquals(2010, film.getUdgivelseår());
    }

    @Test
    public void filmMedTitelOgProducer() {
        Film film = new Film("Avatar");
        assertEquals("Avatar", film.getFilmtitel());
        assertEquals(2022, film.getUdgivelseår());
        film.setProducer(new Producer("Gunder Bo"));
        assertEquals("Gunder Bo",film.getProducer().getName());
    }

}