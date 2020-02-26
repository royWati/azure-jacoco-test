package chainbox.io.jacocorunner;

import org.springframework.stereotype.Component;

/**
 * Palin
 *
 * @Since 1.0
 * @Version 1.0
 * @Author munialo.roy@ekenya.co.ke
 */
@Component
public class Palin {

    public boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }
}
