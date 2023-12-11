package baseball.view;

import static baseball.view.OutputEnum.GAME_START;

import baseball.domain.GameResult;

public class OutputView {

    public void printGameStartNotice(){
        System.out.println(GAME_START.getMessage());
    }

    public void printGameResult(GameResult gameResult){

    }

    public void printGameOverNotice(){

    }
}
