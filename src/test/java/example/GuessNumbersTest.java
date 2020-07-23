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

    @Test
    void should_return_0_when_checkTimes_given_5(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int imputNumber= 5;
        String result = guessNumbers.checkTimes(imputNumber);
        Assertions.assertEquals(result, "0");
    }

    @Test
    void should_return_Wrong_Input_Input_again_when_checkTimes_given_6(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int imputNumber= 6;
        String result = guessNumbers.checkTimes(imputNumber);
        Assertions.assertEquals(result, "Wrong Input，Input again");
    }

}
