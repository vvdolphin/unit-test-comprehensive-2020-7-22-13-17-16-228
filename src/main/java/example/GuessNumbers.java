package example;

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
        return new int[]{1, 2, 3, 4};
    }

    public String checkTimes(int i) {
        return i < times ?"0":"outOfTimes";
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

    public boolean isLegal(int[] inputNumbers){
        Valitor valitor = new Valitor();
        return  valitor.getResult(inputNumbers);
    }

}
