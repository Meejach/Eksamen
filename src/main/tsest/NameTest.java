import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class NameTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void nameTest() {
        Names names = new Names("Lulu Neeko Thresh");
        names.udskriv();
        Names names1 = new Names("Jinx Vi");
        names1.udskriv();

    }


}