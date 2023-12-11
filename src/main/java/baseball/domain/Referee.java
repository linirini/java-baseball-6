package baseball.domain;

public class Referee {

    public GameResult determineGameResult(Numbers computerNumbers, Numbers playerNumbers){
        int sameNumbers = playerNumbers.countSameNumbers(computerNumbers);
        int strike = playerNumbers.countSameNumberOnSamePosition(computerNumbers);
        int ball = sameNumbers - strike;
        return new GameResult(ball,strike);
    }

}
