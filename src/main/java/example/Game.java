package example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Game {
    private GuessNumbers guessNumbers = new GuessNumbers();
    private HashMap<String,String> results = new HashMap<>();

    public void game(){
        int[] answer = guessNumbers.generateResult();
        for (int i = 0; i <guessNumbers.getTimes() ; i++) {
            int[] inputNumbers = getNumbers(i);

            String isLegal = guessNumbers.isLegal(inputNumbers);
            if ("000".equals(isLegal)){
                String result = guessNumbers.checkResult(inputNumbers, answer);
                if ("4A0B".equals(result)){
                    System.out.println("guess right");
                    break;
                }else {
                    results.put(inputNumbers.toString(),result);
                    results.entrySet().stream().forEach(item->System.out.println(item.getKey()+" "+item.getValue()));
                }
            }else{
                System.out.println("Wrong number,Input again");
            }
        }


    }

    private int[] getNumbers(int i) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.next().split(" ");
        int[] inputNumbers= new int[input.length];
        for (int j = 0; j <input.length ; j++) {
            inputNumbers[i]=Integer.parseInt(input[i]);
        }
        return inputNumbers;
    }


}
