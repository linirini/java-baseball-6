package baseball.view;

import static baseball.view.InputEnum.GAME_RESTART;
import static baseball.view.InputEnum.NUMBERS_INPUT;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public String inputNumbers() {
        System.out.print(NUMBERS_INPUT.getMessage());
        String input = readLine();
        return input;
    }

    public String inputGameRestart() {
        System.out.println(GAME_RESTART.getMessage());
        String input = readLine();
        return input;
    }

}
