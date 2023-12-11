package baseball.controller;

import static baseball.util.ExceptionEnum.INVALID_RESTART_OPTION;
import static baseball.util.ExceptionEnum.NOT_NUMBER;

import baseball.domain.GameResult;
import baseball.domain.Numbers;
import baseball.domain.RandomNumbersGenerator;
import baseball.domain.Referee;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private static final String RESTART = "1";
    private static final String TERMINATE = "2";
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final RandomNumbersGenerator numbersGenerator = new RandomNumbersGenerator();
    private final Referee referee = new Referee();

    public void run() {
        while (isRestart()) {
            startGame();
            Numbers computerNumbers = createComputerNumbers();
            playGame(computerNumbers);
            endGame();
        }
    }

    private void playGame(Numbers computerNumbers) {
        while (true) {
            Numbers playerNumbers = inputPlayerNumbers();
            GameResult gameResult = referee.determineGameResult(computerNumbers, playerNumbers);
            outputView.printGameResult(gameResult);
            if (gameResult.isAllStrike()) {
                break;
            }
        }
    }

    private Numbers createComputerNumbers() {
        return new Numbers(numbersGenerator.createRandomNumbers());
    }

    private void startGame() {
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
        } catch (NumberFormatException NFE) {
            throw new IllegalArgumentException(NOT_NUMBER.getMessage());
        }
        return numbers;
    }

    private void endGame() {
        outputView.printGameOverNotice();
    }

    private boolean isRestart() {
        String restartInput = inputView.inputGameRestart();
        throwIfInvalidRestartOption(restartInput);
        return restartInput.equals(RESTART);
    }

    private void throwIfInvalidRestartOption(String restartInput) {
        if (!(restartInput.equals(RESTART) || restartInput.equals(TERMINATE))) {
            throw new IllegalArgumentException(INVALID_RESTART_OPTION.getMessage());
        }
    }

}
