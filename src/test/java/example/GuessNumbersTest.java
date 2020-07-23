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
    void should_return_outOfTimes_when_checkTimes_given_6(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int imputNumber= 6;
        String result = guessNumbers.checkTimes(imputNumber);
        Assertions.assertEquals(result, "outOfTimes");
    }

    @Test
    void should_return_0_when_checkNumbersLength_given_4(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int imputNumber=4 ;
        String result = guessNumbers.checkNumbersLength(imputNumber);
        Assertions.assertEquals(result, "0");
    }

    @Test
    void should_return_Wrong_Input_Input_again_when_checkNumbersLength_given_3(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int imputNumber=3 ;
        String result = guessNumbers.checkNumbersLength(imputNumber);
        Assertions.assertEquals(result, "Wrong Input，Input again");
    }

    @Test
    void sholud_return_0_when_checkNumbersRange_given_1234(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] imputNumber = {1,2,3,4} ;
        String result = guessNumbers.checkNumbersRange(imputNumber);
        Assertions.assertEquals(result, "0");


    }

    @Test
    void should_return_Wrong_Input_Input_again_when_checkNumbersRange_given_10234(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] imputNumber={10,2,3,4} ;
        String result = guessNumbers.checkNumbersRange(imputNumber);
        Assertions.assertEquals(result, "Wrong Input，Input again");
    }


    @Test
    void should_return_0_when_checkNumbersDifference_given_1234(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] imputNumber={1,2,3,4} ;
        String result = guessNumbers.checkNumbersDifference(imputNumber);
        Assertions.assertEquals(result, "0");
    }

    @Test
    void should_return_Wrong_Input_Input_again_when_checkNumbersDifference_given_1134(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] imputNumber={1,1,3,4} ;
        String result = guessNumbers.checkNumbersDifference(imputNumber);
        Assertions.assertEquals(result, "Wrong Input,Input again");
    }

    @Test
    void shoud_return_4A0B_when_checkResult_given_1234(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {1,2,3,4};
        String result = guessNumbers.checkResult(inputNumber,answer);
        Assertions.assertEquals(result, "4A0B");
    }

    @Test
    void shoud_return_2A2B_when_checkResult_given_1432(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {1,4,3,2};
        String result = guessNumbers.checkResult(inputNumber,answer);
        Assertions.assertEquals(result, "2A2B");
    }

    @Test
    void shoud_return_0A4B_when_checkResult_given_2341(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {2,3,4,1};
        String result = guessNumbers.checkResult(inputNumber,answer);
        Assertions.assertEquals(result, "0A4B");
    }

    @Test
    void shoud_return_2A1B_when_checkResult_given_1438(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {1,4,3,8};
        String result = guessNumbers.checkResult(inputNumber,answer);
        Assertions.assertEquals(result, "2A1B");
    }

    @Test
    void shoud_return_0A1B_when_checkResult_given_5748(){
        GuessNumbers guessNumbers = new GuessNumbers();
        int[] answer = guessNumbers.generateResult();
        int[] inputNumber = {5,7,4,8};
        String result = guessNumbers.checkResult(inputNumber,answer);
        Assertions.assertEquals(result, "0A1B");
    }



}
