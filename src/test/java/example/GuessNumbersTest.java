package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GuessNumbersTest {
    @Test
    @DisplayName("generateResult")
    void should_generate_result_when_generateResult_given_example() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] example = {1,2,3,4};
        int[] result = guessNumbers.generateResult();
        Assertions.assertEquals(example, result);
    }

}
