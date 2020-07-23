package example;

import java.util.HashSet;

public class GuessNumbers {
    public int[] generateResult() {
        int[] result= {1,2,3,4};
        return result;
    }

    public String checkTimes(int i) {
        if (i<6){
            return "0";
        }else {
            return "outOfTimes";
        }
    }

    public String checkNumbersLength(int inputNumber) {
        if (inputNumber == 4){
            return "0";
        }else {
            return "Wrong Input，Input again";
        }
    }

    public String checkNumbersRange(int[] imputNumber) {
        for (int i :imputNumber) {
            if (i>=10){
                return "Wrong Input，Input again";
            }
        }
        return "0";



    }

    public String checkNumbersDifference(int[] inputNumber) {
        HashSet set = new HashSet();
        for (int i :
                inputNumber) {
            set.add(i);
        }
        if (set.size()== 4){
            return "0";
        }
        return "null";
    }
}
