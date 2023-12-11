package baseball.view;

import static baseball.view.OutputEnum.BALL;
import static baseball.view.OutputEnum.GAME_OVER;
import static baseball.view.OutputEnum.GAME_START;
import static baseball.view.OutputEnum.NOTHING;
import static baseball.view.OutputEnum.STRIKE;

import baseball.domain.GameResult;

public class OutputView {

    public void printGameStartNotice(){
        System.out.println(GAME_START.getMessage());
    }

    public void printGameResult(GameResult gameResult){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(printIfNothing(gameResult));
        stringBuilder.append(printIfBallExists(gameResult.getBall()));
        stringBuilder.append(printIfStrikeExists(gameResult.getStrike()));
        System.out.println(stringBuilder);
    }

    private String printIfNothing(GameResult gameResult) {
        if(gameResult.isNothing()){
            return NOTHING.getMessage();
        }
        return "";
    }

    private String printIfBallExists(int ball) {
        if(ball!=0){
            return ball + BALL.getMessage();
        }
        return "";
    }

    private String printIfStrikeExists(int strike) {
        if(strike!=0){
            return strike + STRIKE.getMessage();
        }
        return "";
    }

    public void printGameOverNotice(){

    }
}
