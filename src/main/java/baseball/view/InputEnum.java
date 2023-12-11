package baseball.view;

public enum InputEnum {
    NUMBERS_INPUT("숫자를 입력해주세요 : "),
    GAME_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private String message;

    InputEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
