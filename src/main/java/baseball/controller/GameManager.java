package baseball.controller;

import baseball.domain.Numbers;
import baseball.domain.RandomNumbersGenerator;
import baseball.domain.Referee;
import baseball.view.InputView;
import baseball.view.OutputEnum;
import baseball.view.OutputView;
import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final RandomNumbersGenerator numbersGenerator = new RandomNumbersGenerator();
    private final Referee referee = new Referee();

    public void run(){
        while(isRestart()){
            startGame();
            Numbers playerNumbers = inputPlayerNumbers();
            endGame();
        }
    }

    public void startGame(){
        outputView.printGameStartNotice();
    }

    private Numbers inputPlayerNumbers() {
        String input = inputView.inputNumbers();
        return new Numbers(convertToNumbers(input));
    }

    private List<Integer> convertToNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        try {
            for (String inputNumber : input.split("")) {
                numbers.add(Integer.parseInt(inputNumber));
            }
        }catch(NumberFormatException NFE){
            throw new IllegalArgumentException();
        }
        return numbers;
    }

    public void endGame(){

    }

    public boolean isRestart(){
        return false;
    }

}
