package baseball.view;

public enum InputEnum {
    NUMBERS_INPUT("숫자를 입력해주세요 : ");

    private String message;

    InputEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
