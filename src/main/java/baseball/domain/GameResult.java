package baseball.domain;

public class GameResult {

    private static final int MAX_COUNT = 3;
    private final int ball;
    private final int strike;

    public GameResult(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isNothing() {
        return ball == 0 && strike == 0;
    }

    public boolean isAllStrike() {
        return strike == MAX_COUNT;
    }

}
