package example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Game {
    private GuessNumbers guessNumbers = new GuessNumbers();
    private HashMap<String,String> results = new HashMap<>();
    private String correctAnswer ="4A0B";


    public static void main(String[] args) {
        Game game = new Game();
        game.game();
    }

    public void game(){
        int[] answer = guessNumbers.generateResult();
        for (int i = 0; i <guessNumbers.getTimes(); i++) {
            System.out.println("input number");
            int[] inputNumbers = getNumbers();
            guessNumber(inputNumbers, answer);
        }
    }

    private void guessNumber(int[] inputNumbers, int[] answer) {
        if (isLegal(inputNumbers)){
            printResult(inputNumbers,answer);
        }else{
            System.out.println("Wrong number,Input again");
        }
    }

    private int[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] inputNumbers= new int[input.length];
        for (int i = 0; i <input.length ; i++) {
            inputNumbers[i]=Integer.parseInt(input[i]);
        }
        return inputNumbers;
    }


    private boolean isLegal(int[] inputNumbers){
        return "000".equals(guessNumbers.isLegal(inputNumbers));
    }

    private void printResult(int[] inputNumbers,int[] answer){
        String result = guessNumbers.checkResult(inputNumbers, answer);
        if (correctAnswer.equals(result)){
            System.out.println("guess right");
        }else {
            results.put(inputNumbers.toString(),result);
            results.entrySet().stream().forEach(item->System.out.println(item.getKey()+" "+item.getValue()));
        }
    }

}
