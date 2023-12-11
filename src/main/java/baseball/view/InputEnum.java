package baseball.view;

public enum InputEnum {
    ;

    private String message;

    InputEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
