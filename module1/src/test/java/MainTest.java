import org.education.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void getWishesTest() {
        String result = Main.getWishes();
        assertEquals("Happy New Year! Wishing you all the best!", result);
    }
}
