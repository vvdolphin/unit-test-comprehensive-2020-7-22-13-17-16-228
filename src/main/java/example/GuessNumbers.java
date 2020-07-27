package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GuessNumbers {
    private int times = 6;
    private int numLength = 4;

    public int getNumLength() {
        return numLength;
    }

    public void setNumLength(int numLength) {
        this.numLength = numLength;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int[] generateResult() {
        int[] result = {1, 2, 3, 4};
        return result;
    }

    public String checkTimes(int i) {
        if (i < times) {
            return "0";
        } else {
            return "outOfTimes";
        }
    }

    public String checkNumbersLength(int inputNumber) {
        if (inputNumber == numLength) {
            return "0";
        } else {
            return "Wrong Input,Input again";
        }
    }

    public String checkNumbersRange(int[] inputNumber) {
        for (int i : inputNumber) {
            if (i >= 10 || i < 0) {
                return "Wrong Input,Input again";
            }
        }
        return "0";
    }

    public String checkNumbersDifference(int[] inputNumber) {
        HashSet set = new HashSet();
        Arrays.stream(inputNumber).forEach(i -> set.add(i));
        if (set.size() == numLength) {
            return "0";
        }
        return "Wrong Input,Input again";
    }

    public String checkResult(int[] inputNumber, int[] answer) {
        int countA = getA(inputNumber, answer);
        int countB = getB(inputNumber, answer);
        return countA + "A" + countB + "B";
    }

    private int getA(int[] inputNumber, int[] answer) {
        int countA = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] == answer[i]) {
                countA++;
            }
        }
        return countA;
    }

    private int getB(int[] inputNumber, int[] answer) {
        int countB = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            for (int j = 0; j < inputNumber.length; j++) {
                if (inputNumber[i] == answer[j] && i != j) {
                    countB++;
                }
            }
        }
        return countB;
    }

    public String isLegle(int[] inputNumbers){
        return   getResult(inputNumbers).stream().filter(item ->item.equals("0")).collect(Collectors.joining());
    }

    private List<String> getResult(int[] inputNumbers){
        List<String> result = new ArrayList<>();
        result.add(checkNumbersDifference(inputNumbers));
        result.add(checkNumbersLength(inputNumbers.length));
        result.add(checkNumbersRange(inputNumbers));
        return result;
    }


}
