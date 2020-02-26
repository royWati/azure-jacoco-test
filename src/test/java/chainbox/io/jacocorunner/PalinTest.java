package chainbox.io.jacocorunner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalinTest {

    @Test
    void isPalindrome() {
        Palin palin = new Palin();
        assertTrue(palin.isPalindrome("noon"));
    }
    @Test
    void rejectPalindrome(){
        Palin palin = new Palin();
        assertFalse(palin.isPalindrome("neon"));
    }
}