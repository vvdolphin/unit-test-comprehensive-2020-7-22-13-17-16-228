package example;

import java.util.HashSet;

public class GuessNumbers {
    private int times=6;

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int[] generateResult() {
        int[] result= {1,2,3,4};
        return result;
    }

    public String checkTimes(int i) {
        if (i<times){
            return "0";
        }else {
            return "outOfTimes";
        }
    }

    public String checkNumbersLength(int inputNumber) {
        if (inputNumber == 4){
            return "0";
        }else {
            return "Wrong Input,Input again";
        }
    }

    public String checkNumbersRange(int[] imputNumber) {
        for (int i :imputNumber) {
            if (i>=10){
                return "Wrong Input,Input again";
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
        return "Wrong Input,Input again";
    }

    public String checkResult(int[] inputNumber, int[] answer) {
        int countA = 0;
        int countB = 0;
        for (int i=0;i<inputNumber.length;i++) {
            if (inputNumber[i] ==answer[i]){
                countA++;
            }else{
                for(int j=0;j<inputNumber.length;j++){
                    if (inputNumber[i]==answer[j] && i !=j){
                        countB++;
                    }
                }
            }
        }
        return countA+"A"+countB+"B";
    }
}
