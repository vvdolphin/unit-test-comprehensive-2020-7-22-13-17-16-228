package example;

import java.util.Arrays;
import java.util.HashSet;


public class Valitor {
    private static int NUMBERLENGTH=4;

    public boolean checkNumbersLength(int inputNumber) {
       return inputNumber == NUMBERLENGTH ?true:false;
    }

    public boolean checkNumbersRange(int[] inputNumber) {
        for (int i : inputNumber) {
            if (i >= 10 || i < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean checkNumbersDifference(int[] inputNumber) {
        HashSet set = new HashSet();
        Arrays.stream(inputNumber).forEach(i -> set.add(i));
        return set.size() == NUMBERLENGTH ? true:false;
    }

    public boolean getResult(int[] inputNumbers){
        return checkNumbersDifference(inputNumbers) &&
        checkNumbersLength(inputNumbers.length) &&
        checkNumbersRange(inputNumbers);
    }
}
