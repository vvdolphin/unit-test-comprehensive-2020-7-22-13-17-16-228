package example;

public class GuessNumbers {
    public int[] generateResult() {
        int[] result= {1,2,3,4};
        return result;
    }

    public String checkTimes(int i) {
        if (i<6){
            return "0";
        }else {
            return "Wrong Input，Input again";
        }
    }
}
