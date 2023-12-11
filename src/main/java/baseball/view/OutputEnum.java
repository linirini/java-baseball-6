package baseball.view;

public enum OutputEnum {
    GAME_START("숫자 야구 게임을 시작합니다.");

    private String message;

    OutputEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
