package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GuessNumbersTest {
    @Test
    @DisplayName("generateResult")
    void should_generate_result_when_generateResult_given_example() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] result = guessNumbers.generateResult();
        StringBuilder nums = new StringBuilder();
        for (int i :
                result) {
            nums.append(i);
        }
        Assertions.assertEquals(nums.toString(), "1234");
    }

    @Test
    void should_return_0_when_checkTimes_given_5() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int imputNumber = 5;
        String result = guessNumbers.checkTimes(imputNumber);
        Assertions.assertEquals(result, "0");
    }

    @Test
    void should_return_outOfTimes_when_checkTimes_given_6() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int inputNumber = 6;
        String result = guessNumbers.checkTimes(inputNumber);
        Assertions.assertEquals(result, "outOfTimes");
    }

    @Test
    void should_return_true_when_checkNumbersLength_given_4() {
        //given
        Valitor valitor = new Valitor();
        int imputNumber = 4;
        //when
        boolean result = valitor.checkNumbersLength(imputNumber);
        //then
        Assertions.assertTrue(result);

    }

    @Test
    void should_return_false_when_checkNumbersLength_given_3() {
        //given
        Valitor valitor = new Valitor();
        int imputNumber = 3;
        //when
        boolean result = valitor.checkNumbersLength(imputNumber);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void sholud_return_true_when_checkNumbersRange_given_1234() {
        //given
        Valitor valitor = new Valitor();
        int[] imputNumber = {1, 2, 3, 4};
        //when
        boolean result = valitor.checkNumbersRange(imputNumber);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_false_when_checkNumbersRange_given_10234() {
        //given
        Valitor valitor = new Valitor();
        int[] imputNumber = {10, 2, 3, 4};
        //when
        boolean result = valitor.checkNumbersRange(imputNumber);
        //then
        Assertions.assertFalse(result);
    }


    @Test
    void should_return_true_when_checkNumbersDifference_given_1234() {
        //given
        Valitor valitor = new Valitor();
        int[] imputNumber = {1, 2, 3, 4};
        boolean result = valitor.checkNumbersDifference(imputNumber);
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_false_when_checkNumbersDifference_given_1134() {
        //given
        Valitor valitor = new Valitor();
        int[] imputNumber = {1, 1, 3, 4};
        boolean result = valitor.checkNumbersDifference(imputNumber);
        Assertions.assertFalse(result);
    }

    @Test
    void shoud_return_4A0B_when_checkResult_given_1234() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {1, 2, 3, 4};
        String result = guessNumbers.checkResult(inputNumber, answer);
        Assertions.assertEquals(result, "4A0B");
    }

    @Test
    void shoud_return_2A2B_when_checkResult_given_1432() {

        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {1, 4, 3, 2};
        String result = guessNumbers.checkResult(inputNumber, answer);

        Assertions.assertEquals(result, "2A2B");
    }

    @Test
    void shoud_return_0A4B_when_checkResult_given_2341() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {2, 3, 4, 1};
        String result = guessNumbers.checkResult(inputNumber, answer);
        Assertions.assertEquals(result, "0A4B");
    }

    @Test
    void shoud_return_2A1B_when_checkResult_given_1438() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {1, 4, 3, 8};
        String result = guessNumbers.checkResult(inputNumber, answer);
        Assertions.assertEquals(result, "2A1B");
    }

    @Test
    void shoud_return_0A1B_when_checkResult_given_5748() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {5, 7, 4, 8};
        String result = guessNumbers.checkResult(inputNumber, answer);
        Assertions.assertEquals(result, "0A1B");
    }

    @Test
    void shoud_return_0A0B_when_checkResult_given_5678() {
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {5, 6, 7, 8};
        String result = guessNumbers.checkResult(inputNumber, answer);
        Assertions.assertEquals(result, "0A0B");
    }

    @Test
    void should_return_true_when_isLegle_given_1234() {
        Game game = new Game();
        int[] inputNumber = {1, 2, 3, 4};
        boolean result = game.isLegal(inputNumber);
        Assertions.assertEquals(result, true);
    }

    @Test
    void should_return_false_when_isLegle_given_1234() {
        Game game = new Game();
        int[] inputNumber = {1, 2, 2, 4};
        boolean result = game.isLegal(inputNumber);
        Assertions.assertEquals(result, false);
    }
}
