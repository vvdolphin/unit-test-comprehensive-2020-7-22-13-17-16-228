package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.BDDMockito.given;

public class GuessNumbersTest {
    @Test
    @DisplayName("generateResult")
    void should_generate_result_when_generateResult_given_example() {
       GuessNumbers guessNumbers = new GuessNumbers();
        int[] result = guessNumbers.generateResult();
        String nums = "";
        for (int i :
                result) {
            nums+=i;
        }
        Assertions.assertEquals(nums, "1234");
    }
}
