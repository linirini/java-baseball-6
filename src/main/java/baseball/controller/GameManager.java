package baseball.controller;

import baseball.domain.RandomNumbersGenerator;
import baseball.domain.Referee;
import baseball.view.InputView;
import baseball.view.OutputEnum;
import baseball.view.OutputView;

public class GameManager {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final RandomNumbersGenerator numbersGenerator = new RandomNumbersGenerator();
    private final Referee referee = new Referee();

    public void run(){
        while(isRestart()){
            startGame();
            endGame();
        }
    }

    public void startGame(){
        outputView.printGameStartNotice();
    }

    public void endGame(){

    }

    public boolean isRestart(){
        return false;
    }

}
