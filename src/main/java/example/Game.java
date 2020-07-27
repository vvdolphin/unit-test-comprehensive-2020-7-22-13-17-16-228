package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private GuessNumbers guessNumbers = new GuessNumbers();


    public String isLegle(int[] inputNumbers){
        List<String> result = new ArrayList<>();
        result.add(guessNumbers.checkNumbersDifference(inputNumbers));
        result.add(guessNumbers.checkNumbersLength(inputNumbers.length));
        result.add(guessNumbers.checkNumbersRange(inputNumbers));
        String msg= result.stream().filter(item ->item.equals("0")).collect(Collectors.joining());
        return msg;
    }









}
