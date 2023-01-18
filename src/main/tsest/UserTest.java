import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void userTest() {
        User user = new User("Dea Kamper");

        user.createUserID();

        assertTrue(user.validUserID());
        user = new User("Jens 1234");
        user.createUserID();
        assertFalse(user.validUserID());
    }


}